package services.serviceImpl;

import exceptions.CategoryNotFoundException;
import exceptions.NotAllowedException;
import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.AdminService;

import static org.junit.jupiter.api.Assertions.*;

class AdminServiceImplTest {
    AdminService adminService;
    Store store;
    Product product;
    User admin;

    @BeforeEach
    void setUp() {
        adminService = new AdminServiceImpl();
        product = new Product();
        store = new Store();
    }

    @Test
    void throwsNotAllowedExceptionIfUserIsNotAdmin() {
        admin = new Buyer(1L, "richy");
        assertThrows(NotAllowedException.class, () -> {
            adminService.addNewProductByProductCategory(product, admin, store);
        });
    }

    @Test
    void throwsCategoryNotFoundExceptionIfCategoryDoesNotExist() {
        admin = new Admin(1L, "YAGI");
        assertThrows(CategoryNotFoundException.class,()-> {
            adminService.addNewProductByProductCategory(product, admin, store);
                });

    }
}