package de.shopBrasil;

/* getProduct, listProducts, addOrder, getOrder, listOrders,*/

import java.util.List;

public class ShopService {

    private final OderRepo myOrders;
    private final ProductRepo myProducts;

    public ShopService(OderRepo myOrders, ProductRepo myProducts) {
        this.myOrders = myOrders;
        this.myProducts = myProducts;
    }

    public Product getProduct(int id) {
        return myProducts.getOneProduct(id);
    }

    public List<Product> listProducts() {
        return myProducts.list();
    }

    public Oder getOder(int id) {
        return myOrders.getOneOrder(id);
    }

    public void add(Oder order) {
        myOrders.add(order);
    }

    public List<Oder> listOrders() {
        return myOrders.list();
    }

}


