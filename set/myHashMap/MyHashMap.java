package com.company.set.myHashMap;

import com.company.list.doubleList.DoubleLinkedList;

import java.util.*;

public class MyHashMap<K, V> {
    private DoubleLinkedList<MyEntry<K, V>>[] array;
    private int capacity;
    private int count;

    public MyHashMap() {
        capacity = 16;
        array = new DoubleLinkedList[capacity];
        count = 0;
    }

    public void put(K key, V value) {
        int result;
        if (count == capacity * 7 / 10) {
            count = 0;
            capacity *= 2;
            result = Math.abs(key.hashCode() % capacity);
            increaseArray();
        } else {
            result = Math.abs(key.hashCode() % capacity);
        }

        if (array[result] == null) {
            array[result] = new DoubleLinkedList<>();
            array[result].add(new MyEntry(key, value));
            count++;
            return;
        }

        for (int i = 0; i < array[result].size(); i++) {
            if (array[result].isEqual(array[result].get(i).getKey(), key)) {
                array[result].get(i).setValue(value);
                return;
            }
        }
        array[result].add(new MyEntry(key, value));
    }

    public V get(K key) {
        int index = key.hashCode() % capacity;
        for (int i = 0; i < array[index].size(); i++) {
            if (array[index].isEqual(array[index].get(i).getKey(), key)) {
                return array[index].get(i).getValue();
            }
        }
        return null;
    }

    public void removeMapElements() {

    }

    private void increaseArray() {
        DoubleLinkedList<MyEntry<K, V>>[] array1 = array;
        array = new DoubleLinkedList[capacity];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != null) {
                for (int j = 0; j < array1[i].size(); j++) {
                    put(array1[i].get(j).getKey(), array1[i].get(j).getValue());
                }
            }
        }
    }

    public HashSet<K> keysSet() {
        HashSet<K> keySet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = 0; j < array[i].size(); j++) {
                    keySet.add(array[i].get(j).getKey());
                }
            }
        }
        return keySet;
    }

    public ArrayList<V> valueList() {
        ArrayList<V> valueList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = 0; j < array[i].size(); j++) {
                    valueList.add(array[i].get(j).getValue());
                }
            }
        }
        return valueList;
    }

    public TreeMap<K, V> convertToTreeMap() {
        TreeMap<K, V> treeMap = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = 0; j < array[i].size(); j++) {
                    treeMap.put(array[i].get(j).getKey(), array[i].get(j).getValue());
                }
            }
        }
        return treeMap;
    }

    public TreeMap<K, V> copyTreeMap(TreeMap<K, V> treeMap) {
        TreeMap<K, V> copyMap = new TreeMap<>();
        Iterator<Map.Entry<K, V>> iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<K, V> temp = iterator.next();
            copyMap.put(temp.getKey(), temp.getValue());
        }

        return copyMap;
    }

    public List<K> getFirsLastKeys(TreeMap<K, V> treeMap) {
        List<K> list = new ArrayList<>();
        Set<K> set = treeMap.keySet();
        Iterator<K> iterator = set.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            K key = iterator.next();
            if (count == 1 || count == set.size()) {
                list.add(key);
            }
            count++;
        }
        return list;
    }

    public Set<K> reverseKeySet(TreeMap<K, V> treeMap){
        List<K> list = new ArrayList<>(treeMap.keySet());
        LinkedHashSet<K> set = new LinkedHashSet<>();
        for (int i = list.size() - 1; i >=0 ; i--) {
            set.add(list.get(i));
        }
        return set;
    }

    @Override
    public String toString() {
        String str = new String("{");
        StringBuilder stringBuilder = new StringBuilder(str);
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                temp++;
                for (int j = 0; j < array[i].size(); j++) {

                    if (temp == count) {
                        stringBuilder.append(array[i].get(j).getKey() + "=" + array[i].get(j).getValue() + "}");
                    } else {
                        stringBuilder.append(array[i].get(j).getKey() + "=" + array[i].get(j).getValue() + ", ");
                    }

                }
            }
        }
        str = stringBuilder.toString();
        return str;
    }
}
