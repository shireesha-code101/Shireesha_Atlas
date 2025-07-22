package day12_java;

import java.util.LinkedList;
import java.util.Objects;

public class Task01 {
    private LinkedList<Entry>[] data;
    private int size;
    private static final double LOAD_FACTOR_THRESHOLD = 0.75;

    @SuppressWarnings("unchecked")
    public Task01(int initialCapacity) {
        data = new LinkedList[initialCapacity];
        size = 0;
    }

    public Task01() {
        this(10); // default capacity
    }

    public void put(String key, int value) {
        int index = getIndex(key);

        if (data[index] == null) {
            data[index] = new LinkedList<>();
        }

        for (Entry e : data[index]) {
            if (e.key.equals(key)) {
                e.value = value; // update existing
                return;
            }
        }

        data[index].add(new Entry(key, value));
        size++;

        if ((double) size / data.length > LOAD_FACTOR_THRESHOLD) {
            resize();
        }
    }

    public Integer get(String key) {
        int index = getIndex(key);
        LinkedList<Entry> bucket = data[index];

        if (bucket != null) {
            for (Entry e : bucket) {
                if (e.key.equals(key)) {
                    return e.value;
                }
            }
        }

        return null; // not found
    }

    public boolean remove(String key) {
        int index = getIndex(key);
        LinkedList<Entry> bucket = data[index];

        if (bucket != null) {
            for (Entry e : bucket) {
                if (e.key.equals(key)) {
                    bucket.remove(e);
                    size--;
                    return true;
                }
            }
        }

        return false; // not found
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        LinkedList<Entry>[] old = data;
        data = new LinkedList[old.length * 2];
        size = 0;

        for (LinkedList<Entry> bucket : old) {
            if (bucket != null) {
                for (Entry e : bucket) {
                    put(e.key, e.value);
                }
            }
        }
    }

    private int getIndex(String key) {
        return Math.abs(Objects.hashCode(key) % data.length);
    }

    private static class Entry {
        final String key;
        int value;

        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

