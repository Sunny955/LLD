package org.lld_practice.patterns.singelton.double_check;

public class DBConnection {
    private volatile static DBConnection conObject;

    private DBConnection() {

    }

    // Double check method
    public static DBConnection getInstance() {
        if (conObject == null) {
            synchronized (DBConnection.class) {
                if (conObject == null) {
                    conObject = new DBConnection();
                }
            }
        }
        return conObject;
    }
}
