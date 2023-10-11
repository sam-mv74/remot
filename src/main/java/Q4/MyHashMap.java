package Q4;

import java.util.Arrays;

public class MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 50;
    private MyNode<K, V>[] node;
    private int size;

    public MyHashMap() {
        node = new MyNode[INITIAL_CAPACITY];
        size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        MyNode<K, V> newMyNode = new MyNode<>(key, value);

        if (node[index] == null) {
            node[index] = newMyNode;
            size++;
        } else {
            MyNode<K, V> current = node[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value; // replace the existing value for the key
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value; // replace the existing value for the key
            } else {
                current.next = newMyNode;
                size++;
            }
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        MyNode<K, V> current = node[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void replace(K key, V value) {
        int index = getIndex(key);
        MyNode<K, V> current = node[index];

        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
    }

    private int getIndex(K key) {
        if (key == null) {
            return 0;
        }
        return key.hashCode() % node.length;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "node=" + Arrays.toString(node) +
                ", size=" + size +
                '}';
    }
}
