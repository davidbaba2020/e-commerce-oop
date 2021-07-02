package models;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
public class Store {
    private Map<String, List<Product>> productMap = new HashMap<>();
}
