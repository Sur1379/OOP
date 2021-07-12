package com.company.set.myHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Methods {

    public static <K, V> void copyMap(HashMap<K, V> hashMap, HashMap<K, V> cloneMap) {
        Iterator<Map.Entry<K, V>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> temp = iterator.next();
            cloneMap.put(temp.getKey(), temp.getValue());
        }
    }

    public static <K, V> void cleanMap(HashMap<K, V> hashMap) {
        Iterator<K> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }



}
