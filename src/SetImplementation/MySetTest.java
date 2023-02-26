package SetImplementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MySetTest {
    @Test
    void add(){
        HashSet<Integer> set = new HashSet<>();
        MySet<Integer> mySet = new MySet<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.size(), mySet.size());
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.size(), mySet.size());

        // testing on characters
        HashSet<Character> set1 = new HashSet<>();
        MySet<Character> mySet1 = new MySet<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.size(), mySet1.size());
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.size(), mySet1.size());

    }

    @Test
    void clear() {
        HashSet<Integer> set = new HashSet<>();
        MySet<Integer> mySet = new MySet<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.size(), mySet.size());
        set.clear();
        mySet.clear();
        assertEquals(set.size(), mySet.size());

        // testing on characters
        HashSet<Character> set1 = new HashSet<>();
        MySet<Character> mySet1 = new MySet<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.size(), mySet1.size());
        set1.clear();
        mySet1.clear();
        assertEquals(set1.size(), mySet1.size());
    }

    @Test
    void contains() {
        HashSet<Integer> set = new HashSet<>();
        MySet<Integer> mySet = new MySet<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        for (int i = 0; i<13; i++){
            assertEquals(set.contains(i), mySet.contains(i));
        }

        // testing on characters
        HashSet<Character> set1 = new HashSet<>();
        MySet<Character> mySet1 = new MySet<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        for (int i = 0; i<13; i++){
            assertEquals(set1.contains((char)('a'+i)),mySet1.contains((char)('a'+i)));
        }
        assertEquals(set1.size(), mySet1.size());
    }

    @Test
    void isEmpty() {
        HashSet<Integer> set = new HashSet<>();
        MySet<Integer> mySet = new MySet<>();
        assertEquals(set.isEmpty(), mySet.isEmpty());
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.isEmpty(), mySet.isEmpty());
        set.clear();
        mySet.clear();
        assertEquals(set.isEmpty(),mySet.isEmpty());

        // testing on characters
        HashSet<Character> set1 = new HashSet<>();
        MySet<Character> mySet1 = new MySet<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.isEmpty(), mySet1.isEmpty());
        set1.clear();
        mySet1.clear();
        assertEquals(set1.isEmpty(), mySet1.isEmpty());
    }

    @Test
    void remove() {
        HashSet<Integer> set = new HashSet<>();
        MySet<Integer> mySet = new MySet<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.size(), mySet.size());
        for (int i = 0; i<13; i++){
            set.remove(i);
            mySet.remove(i);
            assertEquals(set.size(), mySet.size());
        }


        // testing on characters
        HashSet<Character> set1 = new HashSet<>();
        MySet<Character> mySet1 = new MySet<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.size(), mySet1.size());
        for (int i = 0; i<13; i++){
            set1.remove((char)('a'+i));
            mySet1.remove((char)('a'+i));
            assertEquals(set1.size(), mySet1.size());
        }

    }

    @Test
    void toArray() {
        HashSet<Integer> set = new HashSet<>();
        MySet<Integer> mySet = new MySet<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        Object[] arr = set.toArray();
        Object[] myArr = mySet.toArray();
        Arrays.sort(arr);
        Arrays.sort(myArr);
        for(int i=0; i<arr.length; i++)
            assertEquals(arr[i],myArr[i]);

        // testing on characters
        HashSet<Character> set1 = new HashSet<>();
        MySet<Character> mySet1 = new MySet<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        Object[] arr1 = set1.toArray();
        Object[] myArr1 = mySet1.toArray();
        Arrays.sort(arr1);
        Arrays.sort(myArr1);
        for(int i=0; i<arr1.length; i++)
            assertEquals(arr1[i],myArr1[i]);
    }
}