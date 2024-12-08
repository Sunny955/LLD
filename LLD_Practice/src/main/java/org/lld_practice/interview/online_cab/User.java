package org.lld_practice.interview.online_cab;

public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
