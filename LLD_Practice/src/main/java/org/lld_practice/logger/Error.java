package org.lld_practice.logger;

public class Error extends Logger {
    public Error(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
