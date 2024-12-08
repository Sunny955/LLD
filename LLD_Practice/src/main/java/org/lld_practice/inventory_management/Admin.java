package org.lld_practice.inventory_management;

public class Admin extends User {

    public Admin(Integer id, String name) {
        super(id, name, "ADMIN");
    }

    @Override
    public void update(Product product) {
        System.out.println("Admin " + name + " Notified: Low Stock Product: " + product.getName());
    }

}
