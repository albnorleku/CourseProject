package com.roiacademy.collections;

import com.roiacademy.ushtrime.Mesimdhenesi;

import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();


        listOfString.add("test");
        listOfString.add("string 2");
        listOfString.add("test");

        listOfString.size();
        listOfString.clear();
        listOfString.isEmpty();


        //listOfString.remove("test");
        for (String str : listOfString) {
            System.out.println(str);
        }

        Set<String> setOfStrings = new HashSet<>();
        setOfStrings.add("test");
        setOfStrings.add("test");
        listOfString.addAll(setOfStrings);

        Map<Integer, String> map = new HashMap<>();
        map.put(111111, "Adriatik");
        map.put(111111, "Alzan");
        map.put(222222, "Arjanit");
        map.put(333333, "Filan");

        //Map<Integer, Mesimdhenesi> mesimdhenesiMap = new HashMap<>();
        

        System.out.println(map.get(333333));


        LinkedList<String> linkedList = new LinkedList<>();
      

    }

    
}
