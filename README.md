![ezdb4j-logo](https://i.imgur.com/JWfljkT.png)

# ezdb4j
[![Donations Badge](https://yourdonation.rocks/images/badge.svg)](https://carterbrainerd.me/donations)
[![Build Status](https://travis-ci.org/cbrnrd/ezdb4j.svg?branch=master)](https://travis-ci.org/cbrnrd/ezdb4j)

## Introduction

The Java library for communicating with the ezdb daemon.

## Code Samples

```java
import io.codepace.ezdb4j.*;

// Create a new connection to the ezdb daemon
EzdbConnection connection = EzdbConnector.createConnection();

// Get the value of key and store it as a String
String value = connection.get("keyvalue");

// Kill the connection
connection.terminate();
```

## Installation

```
dependencies {
    compile 'io.codepace:ezdb4j:0.1.0'
}
```
