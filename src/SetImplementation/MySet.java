package SetImplementation;

import java.util.Iterator;

public class MySet<E> {
    private Object[] set;
    private int allocLen;
    private int logLen;
    public MySet(){
        allocLen = 4;
        logLen = 0;
        set = new Object[allocLen];
    }
    public MySet(int capacity){
        allocLen = capacity;
        logLen = 0;
        set = new Object[allocLen];
    }

    public void clear(){
        logLen = 0;
        set = new Object[allocLen];
    }

    private int index(Object o){
        for(int i = 0; i<logLen; i++){
            if(set[i].equals(o)) return i;
        }
        return -1;
    }

    public boolean contains(Object o){
        int index = index(o);
        return index != -1;
    }

    public boolean isEmpty(){
        return logLen==0;
    }

    public boolean remove(Object o){
        int index = index(o);
        for(int i = index; i<logLen-1; i++){
            set[i] = set[i+1];
        }
        if(index!=-1) logLen--;
        return index != -1;
    }

    public int size(){
        return logLen;
    }

    public Object[] toArray(){
        Object[] res = new Object[logLen];
        for(int i = 0; i<logLen; i++){
            res[i] = set[i];
        }
        return res;
    }
    private void grow(){
        allocLen*=2;
        Object res[] = new Object[allocLen];
        for(int i = 0; i<logLen; i++){
            res[i] = set[i];
        }
        set = res;
    }
    public boolean add(E e){
        int index = index(e);
        if(index==-1){
            if(logLen==allocLen){
                grow();
            }
            set[logLen] = e;
            logLen++;
        }
        return index==-1;
    }

}
