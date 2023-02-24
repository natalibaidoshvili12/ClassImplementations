package MapImplementation;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MyMapTest {
    @Test
    void put(){
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        for (int i = 0; i<13; i++){
            assertEquals(map.get(i), myMap.get(i));
        }
        for (int i = 0; i<13; i++){
            assertEquals(map.put(i,i*i*i), myMap.put(i,i*i*i));
        }
        assertEquals(map.size(), myMap.size());
        for (int i = 0; i<13; i++){
            assertEquals(map.get(i), myMap.get(i));
        }
    }

    @Test
    void size() {
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        assertEquals(map.size(), myMap.size());
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        assertEquals(map.size(), myMap.size());
    }

    @Test
    void isEmpty() {
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        assertEquals(map.isEmpty(), myMap.isEmpty());
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        assertEquals(map.isEmpty(), myMap.isEmpty());
    }

    @Test
    void containsKey() {
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        for (int i = 0; i<13; i++){
            assertEquals(map.containsKey(i), myMap.containsKey(i));
        }

    }

    @Test
    void containsValue() {
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        for (int i = 0; i<13; i++){
            assertEquals(map.containsValue(i*i), myMap.containsValue(i*i));
        }
    }

    @Test
    void get() {
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        for (int i = 0; i<13; i++){
            assertEquals(map.get(i), myMap.get(i));
        }
    }

    @Test
    void remove() {
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        for (int i = 0; i<13; i++){
            map.remove(i);
            myMap.remove(i);
            assertEquals(map.size(), myMap.size());
        }
    }

    @Test
    void putAll() {
        Map<Integer, Integer> testMap = new HashMap<>();
        for (int i = 0; i<13; i++){
            testMap.put(i,i*i);
        }
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        map.putAll(testMap);
        myMap.putAll(testMap);
        assertEquals(myMap.size(), map.size());
    }

    @Test
    void clear() {
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        assertEquals(map.size(), myMap.size());
        map.clear();
        myMap.clear();
        assertEquals(map.size(), myMap.size());
    }

    @Test
    void keySet() {
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        Set<Integer> keySet = myMap.keySet();
        for(Integer key: map.keySet()){
            assertTrue(keySet.contains(key));
        }


    }

    @Test
    void values() {
        MyMap<Integer,Integer> myMap = new MyMap<Integer,Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<13; i++){
            map.put(i,i*i);
            myMap.put(i,i*i);
        }
        Collection<Integer> valueSet = myMap.values();
        for(Integer value: map.values()){
            assertTrue(valueSet.contains(value));
        }
    }

}