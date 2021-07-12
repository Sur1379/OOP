package com.company.set.myHashMap;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> hashMap = new MyHashMap<>();
        hashMap.put(1, "Davo");
        hashMap.put(2, "Suro");
        hashMap.put(3, "Tre");
        hashMap.put(17, "Samo");
        System.out.println(hashMap);

        HashMap<Integer,String> hashMap1 = new HashMap();
        hashMap1.put(1, "Davo");
        hashMap1.put(2, "Suro");
        hashMap1.put(3, "Tre");
        hashMap1.put(17, "Samo");
        System.out.println(hashMap1);
        System.out.println(hashMap.get(17));


    }
}
