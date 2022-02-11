package de.shopBrasil;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    List<Product> listOfProduct = new ArrayList<>();

    public List<Product> list () {
        return listOfProduct;

    }

    public Product getOneProduct (int id) {
        for (Product product: listOfProduct) {
            if (product.getId() ==  id) {
                return product;
            }

        }
        return null;
    }


}

