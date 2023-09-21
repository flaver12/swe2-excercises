package ch.juventus;


import java.util.HashMap;
import java.util.Map;

import ch.juventus.collections.TodoList;
import ch.juventus.entity.Address;
import ch.juventus.entity.Person;
import ch.juventus.generics.MapFilter;

public class Application {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        /* 
        Address address = new Address("Bahnhofstrasse", 1, "Zürich", "8001");
        Person person = new Person("Hans", "Muster", 42, true);
        Person person2 = new Person("Hans", "Muster", 42, true);
        Person person3 = new Person("Hans", "Muster2", 42, true);

        System.out.println(person);
        System.out.println(address);
        System.out.println(person.equals(person2));
        System.out.println(person.equals(person3));
        */

        // TodoList.arrayList();
        // TodoList.linkedList();
        // TodoList.hashSet();
        // TodoList.linkedHashSet();
        // TodoList.treeSet();
        // TodoList.hashMap();
        // TodoList.treeMap();

        MapFilter<String, Integer> mapFilter = new MapFilter<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 42);
        map.put("b", 42);
        map.put("c", 43);
        map.put("d", 44);
        map.put("f", 45);
        System.out.println(mapFilter.cleanUp(map, 42));

        MapFilter<String, String> mapFilter2 = new MapFilter<>();
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("a", "42");
        map2.put("b", "42");
        map2.put("c", "43");
        map2.put("d", "44");
        map2.put("f", "45");
        System.out.println(mapFilter2.cleanUp(map2, "42"));
    }
}
