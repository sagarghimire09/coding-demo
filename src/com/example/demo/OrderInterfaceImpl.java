package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class OrderInterfaceImpl implements OrderInterface {
    private static Map<Integer, OrderDetails> orderMap = new HashMap<>();

    @Override
    public OrderDetails getOrder(int id) {
        if(orderMap.get(id) != null)
            return orderMap.get(id);
        // perform REST CALL and save in the map and return

        OrderDetails newOrder = new OrderDetails();
        orderMap.put(111, newOrder);

        //traverse
        orderMap.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()));

        return newOrder;
    }
}
