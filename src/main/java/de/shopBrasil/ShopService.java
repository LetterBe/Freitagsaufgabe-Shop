package de.shopBrasil;

/* getProduct, listProducts, addOrder, getOrder, listOrders,*/

import java.util.List;

public class ShopService {

    private OderRepo myOrders;
    private ProductRepo myProducts;

    public ShopService(OderRepo myOrders, ProductRepo myProducts) {
        this.myOrders = myOrders;
        this.myProducts = myProducts;
    }

    public void Product getProduct (int id){
        myProducts.getOneProduct(id);
    }

    public List<Product> listProducts () {
        return myProducts.list();
    }

    public Oder getOder (int id){
        myOrders.getOneOrder(id);
    }

    public void add (Oder order ) {
         myOrders.add(order);
    }

    public void ListOrders () {



    }



}

