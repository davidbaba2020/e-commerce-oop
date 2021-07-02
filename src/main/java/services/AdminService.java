package services;

import models.Product;
import models.Store;
import models.User;

public interface AdminService {
    void addNewProductByProductCategory(Product product, User user, Store store);
}
