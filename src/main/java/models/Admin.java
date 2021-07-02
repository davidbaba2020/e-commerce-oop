package models;

import enums.UserRole;

public class Admin extends User {
    public Admin(Long id, String name) {
        super(id, name, UserRole.ADMIN);
    }
}
