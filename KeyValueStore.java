//This class represents a generic key-value store capable of holding two related data elements. 
//It is defined with two type parameters (K for the key and V for the value), allowing it to store 
//pairs of related items of any types (like String for a username and Integer for an age). This class 
//exemplifies how generics can be applied to create data structures that are flexible in terms of the 
//types of data they can hold.

public class KeyValueStore<K, V> {
    private K key;
    private V value;

    public KeyValueStore(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}