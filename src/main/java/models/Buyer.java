package models;

import enums.UserRole;

import java.util.List;

public class Buyer extends User {
    private List<Product> cart;
    public Buyer(Long id, String name) {
        super(id, name, UserRole.BUYER);
    }
}
