package de.shopBrasil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OderRepo {

   private List<Oder> listOfOrders = new ArrayList<>();

    public List<Oder> list() {
        return listOfOrders;

    }

    public Oder getOneOrder(int id) {
        for (Oder order : listOfOrders) {
            if (order.getId() == id) {
                return order;
            }

        }
        return null;

    }

    public void add(Oder order) {
        listOfOrders.add(order);

    }

}




