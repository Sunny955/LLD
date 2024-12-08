package org.lld_practice.inventory_management;

public class InventoryManager extends User {

    public InventoryManager(Integer id, String name) {
        super(id, name, "Manager");
    }

    @Override
    public void update(Product product) {
        System.out.println("Manager " + name + " Notified: Low Stock Product: " + product.getName());
    }

}
