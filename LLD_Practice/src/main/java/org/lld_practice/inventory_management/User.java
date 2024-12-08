package org.lld_practice.inventory_management;

public abstract class User {
    protected Integer id;
    protected String name;
    protected String role;

    public User(Integer id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public abstract void update(Product product);

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }
}