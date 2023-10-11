package Q4;

public class MyNode<K,V>{
    K key;
    V value;
    MyNode<K, V> next;

    MyNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
