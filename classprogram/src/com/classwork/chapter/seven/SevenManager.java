package com.classwork.chapter.seven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SevenManager {

    public static void main(String[] args){
        Customer customer1 = new Customer("123","John");
        Customer customer2 = new Customer("456","Tom");

        List list = new ArrayList();
        list.add(customer1);
        list.add(customer2);

        Map<String,Customer> map = new HashMap<>();
        map.put("001",customer1);
        map.put("002",customer2);

        //  map.get("001");
        //  map.get("002");

        System.out.println(map.get("001").toString());

        //System.out.println(list.get(0).toString());
        // System.out.println(list.get(1).toString());


    }
}
