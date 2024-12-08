package org.lld_practice.patterns.chain_of_responsibility;

public class Debuglog extends LogProcessor {

    Debuglog(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG :" + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
