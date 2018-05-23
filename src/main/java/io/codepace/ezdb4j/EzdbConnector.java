package main.java.io.codepace.ezdb4j;

public class EzdbConnector {

    /**
     * Instances should not be constructed in regular programming
     */
    private EzdbConnector(){}

    /**
     * Creates a new {@link main.java.io.codepace.ezdb4j.EzdbConnection} for communication with the ezdb daemon.
     * @return {@link main.java.io.codepace.ezdb4j.EzdbConnection} A new connection with the ezdb connection
     */
    public static EzdbConnection createConnection(){
        return new EzdbConnection();
    }

    /**
     * Closes the <code>conn</code> connection to the daemon
     * @see EzdbConnection#terminate()
     * @param conn The connection to close
     */
    public static void killConnection(EzdbConnection conn){
        conn.terminate();
    }
}
