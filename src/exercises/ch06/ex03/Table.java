package exercises.ch06.ex03;

import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {
    private List<Entry<K, V>> list = new ArrayList<>();

    public V get(K key) {
        return list.stream().filter(e -> (e.key).equals(key)).map(e -> e.value).findAny().orElse(null);
    }

    public V put(K key, V value) {
        list.removeIf(e -> (e.key).equals(key));
        list.add(new Entry<>(key, value));
        return value;
    }

    public V remove(K key) {
        V value = get(key);
        list.removeIf(e -> (e.key).equals(key));
        return value;
    }

    private class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}