package ListImplementation;

import java.util.*;

public class MyList<E> implements List<E> {

    private Object elems[];
    private int allocLength;
    private int logicLength;

    public MyList(){
        allocLength = 4;
        logicLength = 0;
        elems = new Object[allocLength];
    }

    public MyList(int initialCapacity){
        allocLength = initialCapacity;
        logicLength = 0;
        elems = new Object[allocLength];
    }


    public boolean add(E elem){
        if(logicLength==allocLength){
            elems = grow();
        }
        elems[logicLength] = elem;
        logicLength++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i<logicLength; i++){
            if(elems[i].equals(o)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        return (E) elems[index];
    }

    @Override
    public E set(int index, E element) {
        if(index<logicLength){
            E oldElem = (E) elems[index];
            elems[index] = element;
            return oldElem;
        }
        return null;
    }

    @Override
    public void add(int position, E elem) {
        if(allocLength+1==logicLength){
            elems = grow();
        }
        for(int i=logicLength; i>=position; i--){
            elems[i] = elems[i-1];
        }
        elems[position] = elem;
        logicLength++;
    }


    @Override
    public void clear() {
        logicLength = 0;
        elems = new Object[allocLength];
    }

    private Object[] grow() {
        Object arr[] = new Object[2*allocLength];
        for(int i=0; i<logicLength; i++){
            arr[i] = elems[i];
        }
        allocLength *= 2;
        return arr;
    }


    public E remove(int index){
        E elem = (E) elems[index];
        for (int i = index; i<logicLength-1; i++){
            elems[i] = elems[i+1];
        }
        logicLength--;
        return elem;
    }

    public int size(){
        return logicLength;
    }

    public boolean isEmpty(){
        return logicLength == 0;
    }

    public boolean contains(Object elem){
        for (int i = 0; i<logicLength; i++){
            if(elems[i].equals(elem)) return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[logicLength];
        for (int i = 0; i<logicLength; i++){
            result[i] = elems[i];
        }
        return result;
    }

    public int indexOf(Object elem){
        for (int i = 0; i<logicLength; i++){
            if(elems[i].equals(elem)) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = 0; i<logicLength; i++){
            if(elems[i].equals(o)) index = i;
        }
        return index;
    }


    // you don't have to implement from here

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        List<E> elemList = new ArrayList<>();
        for (int i = fromIndex; i < toIndex; i++) {
            elemList.add((E) elems[i]);
        }
        return elemList;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Object[] elements = c.toArray();
        for (int i = 0; i < elements.length; i++) {
            if(!contains(elements[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Object[] elements = c.toArray();
        for (int i = 0; i < elements.length; i++) {
            if(!add((E) elements[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        return true;
    }
}
