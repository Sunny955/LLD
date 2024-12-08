package org.lld_practice.logger;

public class Info extends Logger {

    public Info(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }

}
