package ch.juventus.generics;

import java.util.Map;

public class MapFilter<T, R> {

    public Map<T, R> cleanUp(Map<T, R> map, R value) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(value));
        return map;
    }   
}
