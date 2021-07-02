package services;

import models.Product;
import models.User;

public interface BuyerService {
    void buyProduct(Product product, User user);

    void addProductToCart(Product product, User user);

    void buyAllProductsInCart();
}
