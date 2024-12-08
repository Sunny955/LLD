package org.lld_practice.patterns.chain_of_responsibility;

public class Errorlog extends LogProcessor {

    Errorlog(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("ERROR :" + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
