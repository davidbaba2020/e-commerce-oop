import models.Admin;
import models.Product;
import models.Store;
import services.AdminService;
import services.serviceImpl.AdminServiceImpl;

public class StoreApp {
    public static void main(String[] args) {
        Store store = new Store();
        Admin admin = new Admin(1L, "Micheal");
        AdminService adminService = new AdminServiceImpl();
        Product shirt = new
                Product(1L, "hoodie", "shirts", 25);
        Product tshirt = new
                Product(1L, "tshirrrrt", "shirts", 25);

        Product laptop = new
                Product(1L, "macbook air", "laptops", 50);

        System.out.println(store.getProductMap());

        adminService.addNewProductByProductCategory(shirt, admin, store);

        System.out.println(store.getProductMap());

        adminService.addNewProductByProductCategory(laptop, admin, store);

        System.out.println(store.getProductMap());

        adminService.addNewProductByProductCategory(tshirt, admin, store);

        System.out.println(store.getProductMap());
    }
}
