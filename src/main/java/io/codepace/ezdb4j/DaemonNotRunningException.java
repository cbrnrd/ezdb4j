package io.codepace.ezdb4j;

public class DaemonNotRunningException extends Exception {

    public DaemonNotRunningException(){super();}
    public DaemonNotRunningException(String message){super(message);}
    public DaemonNotRunningException(String message, Throwable cause){super(message, cause);}

}
