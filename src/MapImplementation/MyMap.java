package MapImplementation;
import java.util.*;
public class MyMap<K,V> implements Map<K,V> {
    private int allocLength;
    private int logLength;
    private Object[] keys;
    private Object[] values;
    public MyMap(){
        allocLength = 4;
        logLength = 0;
        keys = new Object[allocLength];
        values = new Object[allocLength];
    }
    @Override
    public int size() {
        return logLength;
    }

    @Override
    public boolean isEmpty() {
        return logLength==0;
    }

    private int getKeyIndex(Object key){
        for(int i = 0; i<logLength; i++){
            if(keys[i].equals(key)) return i;
        }
        return -1;
    }
    @Override
    public boolean containsKey(Object key) {

        return getKeyIndex(key)!=-1;
    }

    @Override
    public boolean containsValue(Object value) {
        for(int i = 0; i<logLength; i++){
            if(values[i].equals(value)) return true;
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int index = getKeyIndex(key);
        if(index != -1) return (V) values[index];
        return null;
    }

    private void grow(){
        allocLength*=2;
        Object[] resultKey = new Object[allocLength];
        Object[] resultValue = new Object[allocLength];
        for(int i = 0; i<logLength; i++){
            resultKey[i] = keys[i];
            resultValue[i] = values[i];
        }
        keys = resultKey;
        values = resultValue;
    }

    @Override
    public Object put(Object key, Object value) {
        if(logLength==allocLength) grow();
        int index = getKeyIndex(key);
        if(index != -1){
            Object oldValue = values[index];
            values[index] = value;
            return oldValue;
        }else{
            keys[logLength] = key;
            values[logLength] = value;
            logLength++;
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        int index = getKeyIndex(key);
        if(index == -1) return null;
        V value = (V) values[index];
        for(int i = index; i<logLength; i++){
            keys[i] = keys[i+1];
            values[i] = values[i+1];
        }
        logLength--;
        return value;
    }

    @Override
    public void putAll(Map m) {
        for(Object key : m.keySet()){
            if(logLength==allocLength) grow();
            keys[logLength] = key;
            values[logLength] = m.get(key);
            logLength++;
        }
    }

    @Override
    public void clear() {
        logLength = 0;
        keys = new Object[allocLength];
        values = new Object[allocLength];
    }

    @Override
    public Set keySet() {
        Set set = new HashSet();
        for (int i = 0; i<logLength; i++){
            set.add(keys[i]);
        }
        return set;
    }

    @Override
    public Collection values() {
        Collection collection = new ArrayList();
        for (int i = 0; i<logLength; i++){
            collection.add(values[i]);
        }
        return collection;
    }

    // it's not necessary to implement this
    @Override
    public Set<Entry<K, V>> entrySet() {

        return null;
    }
}
