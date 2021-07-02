package services.serviceImpl;

import enums.UserRole;
import exceptions.CategoryNotFoundException;
import exceptions.NotAllowedException;
import models.Product;
import models.Store;
import models.User;
import services.AdminService;

import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Override
    public void addNewProductByProductCategory(Product product, User user, Store store) {
        checkIfUserIsAdmin(user);
        String productCategory = product.getProductCategory();
        if (productCategory == null || productCategory.isEmpty()) {
            throw new CategoryNotFoundException("category not found");
        }
        List<Product> category = getProductCategoryList(product.getProductCategory(), store);
        category = addProductToProductList(category, product);
        addProductToMap(category, product.getProductCategory(), store);

    }

    private List<Product> getProductCategoryList(String categoryName, Store store) {
        return store.getProductMap().get(categoryName);
    }
    private void checkIfUserIsAdmin (User user) {
        if (!user.getRole().equals(UserRole.ADMIN))
            throw new NotAllowedException("you do not have access rights!!");
    }


    private List addProductToProductList(List<Product> productList, Product product) {
        if (productList == null) {
            productList = new ArrayList<>();
        }
        productList.add(product);
        return productList;
    }

    private void addProductToMap(List<Product> productList, String categoryName, Store store) {
        store.getProductMap().put(categoryName, productList);
    }
}
