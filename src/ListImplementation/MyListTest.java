package ListImplementation;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    @Test
    public void testCreation(){
        MyList<Integer> myList = new MyList<Integer>();
        assertNotEquals(myList, null);
        MyList<Integer> myList1 = new MyList<Integer>(3);
        assertNotEquals(myList1, null);
    }

    public void get(MyList<Integer> myList, ArrayList<Integer> integers){
        assertEquals(myList.size(), integers.size());
        for (int i = 0; i<myList.size(); i++) {
            assertEquals(myList.get(i), integers.get(i));
        }
    }

    @Test
    void addAndGet() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<15; i++){
            myList.add(i);
            integers.add(i);
        }
        get(myList,integers);
        myList.add(3, 5);
        integers.add(3, 5);

        get(myList,integers);
    }

    @Test
    void removeAndGet() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<15; i++){
            myList.add(i);
            integers.add(i);
        }
        myList.remove(myList.size()-1);
        integers.remove(integers.size()-1);
        get(myList, integers);
    }

    @Test
    void setAndGet() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<15; i++){
            myList.add(i);
            integers.add(i);
        }
        myList.set(3, 10);
        integers.set(3, 10);
        get(myList,integers);
    }

    @Test
    void clear() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<15; i++){
            myList.add(i);
            integers.add(i);
        }
        myList.clear();
        integers.clear();
        get(myList,integers);
    }


    @Test
    void size() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<15; i++){
            myList.add(i);
            integers.add(i);
        }
        assertEquals(myList.size(), integers.size());
    }

    @Test
    void isEmpty() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<15; i++){
            myList.add(i);
            integers.add(i);
        }
        assertEquals(myList.isEmpty(), integers.isEmpty());
        myList.clear();
        integers.clear();
        assertEquals(myList.isEmpty(), integers.isEmpty());
    }

    @Test
    void contains() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<15; i++){
            myList.add(i);
            integers.add(i);
        }
        for (int i = 0; i<23; i++) {
            assertEquals(myList.contains(i), integers.contains(i));
        }
    }

    @Test
    void toArray() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        Object myListArr[] = myList.toArray();
        Object integerArr[] = integers.toArray();
        assertEquals(myListArr.length, integerArr.length);
        for(int i = 0; i<myListArr.length; i++){
            assertEquals(myListArr[i], integerArr[i]);
        }

    }

    @Test
    void indexOf() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<15; i++){
            myList.add(i);
            integers.add(i);
        }
        for (int i = 0; i<23; i++) {
            assertEquals(myList.indexOf(i), integers.indexOf(i));
        }
    }

    @Test
    void lastIndexOf() {
        MyList<Integer> myList = new MyList<Integer>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<15; i++){
            myList.add(i);
            integers.add(i);
        }
        for (int i = 0; i<23; i++) {
            assertEquals(myList.lastIndexOf(i), integers.lastIndexOf(i));
        }
    }
}