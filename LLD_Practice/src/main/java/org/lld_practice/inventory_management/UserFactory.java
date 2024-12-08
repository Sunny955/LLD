package org.lld_practice.inventory_management;

public class UserFactory {
    public static User createUser(int id, String name, String role) {
        if (role.equals("Admin")) {
            return new Admin(id, name);
        } else if (role.equals("InventoryManager")) {
            return new InventoryManager(id, name);
        }
        return null;
    }
}
