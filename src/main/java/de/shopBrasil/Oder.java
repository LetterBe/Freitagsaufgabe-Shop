package de.shopBrasil;

import java.util.List;
import java.util.Objects;

public class Oder {
    private final List<Integer> products;
    private final int id;

    public Oder(List<Integer> products, int id) {
        this.products = products;
        this.id = id;
    }

    public List<Integer> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }
}


