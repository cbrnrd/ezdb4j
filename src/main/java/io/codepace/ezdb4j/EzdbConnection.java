package main.java.io.codepace.ezdb4j;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class EzdbConnection implements Connection{

    private Socket connection;
    private DataOutputStream out;
    private DataInputStream in;

    public EzdbConnection(){
        try {
            connection = new Socket("0.0.0.0", 28468);
            if (!connection.isConnected()){
                throw new DaemonNotRunningException("ezdb daemon service not running!");
            }
            out = new DataOutputStream(connection.getOutputStream());
            in = new DataInputStream(connection.getInputStream());
        } catch (IOException | DaemonNotRunningException ioe){
            System.out.println(ioe.getMessage());
        }
    }

    /**
     * Sets the value at <code>key</code> to <code>value</code>
     * @param key They key to set
     * @param value The value to set
     * @return String the value if it is completed successfully
     */
    public String set(String key, String value){
        try {
            out.writeUTF("set " + key + " " + value + "\n");
            out.flush();
            return in.readUTF().replace("\n", "");
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        return null;
    }

    /**
     * Gets the value at <code>key</code>
     * @param key The key tat which to get the data
     * @return String the value if it is completed successfully
     */
    public String get(String key){
        try {
            out.writeUTF("get " + key + "\n");
            out.flush();
            return in.readUTF().replace("\n", "");
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        return null;
    }

    /**
     * Gets all data in the db as a JSON string
     * @return String the data in the database represented as a JSON string
     */
    public String getAllAsJsonString(){
        try {
            out.writeUTF("get *\n");
            out.flush();
            return in.readUTF();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        return null;
    }

    /**
     * Unsets the value at <code>key</code>
     * @param key The key to unset
     */
    public void unset(String key){
        try {
            out.writeUTF("unset " + key + "\n");
            out.flush();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    /**
     * Safely terminates the connection between the daemon and the program
     */
    public void terminate(){
        try{
            out.writeUTF(".exit\n");
            Thread.sleep(500); // give time for server to close connection
            out.flush();
            out.close();
            in.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
