package com.company.set.myHashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class Homework {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("Suren", "vle");
        hashMap.put("sahak", "var");
        hashMap.put("Mher", "asd");
        hashMap.put("sadas", "rfgre");
        hashMap.put("wekrmke", "lkermlk");

//    1    HashMap<String, String> hashMap1 = new HashMap();
//        Methods.copyMap(hashMap, hashMap1);
//        System.out.println(hashMap);
//        System.out.println(hashMap1);

////   2     Methods.cleanMap(hashMap);
//        System.out.println(hashMap);

//     3   hashMap.isEmpty();

        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("Suren", "vle");
        myHashMap.put("Suren1", "vle1");
        myHashMap.put("Suren2", "vle2");
        System.out.println(myHashMap.keysSet());

        System.out.println(myHashMap.valueList());


        TreeMap<String, String> treeMap = myHashMap.convertToTreeMap();
        System.out.println(treeMap);

        System.out.println(myHashMap.copyTreeMap(treeMap));

        System.out.println(myHashMap.getFirsLastKeys(treeMap));

        System.out.println(myHashMap.reverseKeySet(treeMap));
    }

}
