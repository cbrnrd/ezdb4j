package io.codepace.ezdb4j;

public interface Connection {

    String set(String key, String value);
    String get(String key);
    String getAllAsJsonString();
    void unset(String key);
    void qset(String key, String value);
    void terminate();
}
