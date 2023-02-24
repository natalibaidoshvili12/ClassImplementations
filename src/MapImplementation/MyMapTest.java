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

        // testing on characters
        MyMap<Character, Integer> myMap1 = new MyMap<>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }
        for (int i = 0; i<13; i++){
            assertEquals(map1.get(i), myMap1.get(i));
        }
        for (int i = 0; i<13; i++){
            assertEquals(map1.put((char) ('a'+i),i+1), myMap1.put((char) ('a'+i),i+1));
        }
        assertEquals(map1.size(), myMap1.size());
        for (int i = 0; i<13; i++){
            assertEquals(map1.get(i), myMap1.get(i));
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

        //testing on characters
        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        assertEquals(map1.size(), myMap1.size());
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }
        assertEquals(map1.size(), myMap1.size());
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

        // testing on characters
        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        assertEquals(map1.isEmpty(), myMap1.isEmpty());
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }
        assertEquals(map1.isEmpty(), myMap1.isEmpty());
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
        // testing on characters
        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }
        for (int i = 0; i<13; i++){
            assertEquals(map.containsKey((char) ('a'+i)), myMap.containsKey((char) ('a'+i)));
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

        // testing on characters

        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }
        for (int i = 0; i<13; i++){
            assertEquals(map.containsValue(i), myMap.containsValue(i));
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
    // testing on characters
        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }

        for (int i = 0; i<13; i++){
            assertEquals(map.get((char) ('a'+i)), myMap.get((char) ('a'+i)));
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

        // testing on characters
        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }

        for (int i = 0; i<13; i++){
            map.remove((char) ('a'+i));
            myMap.remove((char) ('a'+i));
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

        // testing on characters
        Map<Character, Integer> testMap1 = new HashMap<>();
        for (int i = 0; i<13; i++){
            testMap1.put((char) ('a'+i),i*i);
        }
        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        map1.putAll(testMap1);
        myMap1.putAll(testMap1);
        assertEquals(myMap1.size(), map1.size());
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
    // testing on characters
        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }
        assertEquals(map1.size(), myMap1.size());
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
        //testing on characters
        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }
        Set<Integer> keySet1 = myMap1.keySet();
        for(Character key: map1.keySet()){
            assertTrue(keySet1.contains(key));
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

        // testing on characters
        MyMap<Character,Integer> myMap1 = new MyMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i<13; i++){
            map1.put((char) ('a'+i),i);
            myMap1.put((char) ('a'+i),i);
        }
        Collection<Integer> valueSet1 = myMap1.values();
        for(Integer value: map1.values()){
            assertTrue(valueSet1.contains(value));
        }
    }

}