package models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"productId", "productCategory", "price"})
public class Product {
    private Long productId;
    private String productName;
    private String productCategory;
    private double price;
}
