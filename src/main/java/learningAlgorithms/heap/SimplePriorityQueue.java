package learningAlgorithms.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SimplePriorityQueue<T> {
//    private class PriorityQueueNode<K> {
//        K value;
//        PriorityQueueNode<K> next = null;
//        PriorityQueueNode<K> previous = null;
//
//        PriorityQueueNode(K val, Integer priority) {
//            value = val;
//        }
//        PriorityQueueNode(K val, PriorityQueueNode<K> next, PriorityQueueNode<K> previous) {
//            value = val;
//            this.next = next;
//            this.previous = previous;
//        }
//    }

    static int DEFAULT_SIZE = 16;
    static int SCALE_FACTOR = 2;

    T[] store;
    int size;
    static int START_POSITION = 1;
    int tail = START_POSITION - 1;

    SimplePriorityQueue() {
        size = DEFAULT_SIZE;
//        head = new T[size]; // @NOTE : Not allowed to initialize a generic type array. Compiler gives error . Reification error
        // @CHECK : How to initialize a generic array type .... HINT : https://www.baeldung.com/java-generic-array , https://stackoverflow.com/questions/50266224/how-to-initialize-generic-array
        store = (T[]) new Object[size];
    }
    SimplePriorityQueue(int size) {
        this.size = size;
        store = (T[]) new Object[this.size];
    }
    public void add(T val) {
        if(! (tail < size - 1)) {
            upSize();
        }
        store[++tail] = val;
        swimUp();
    }

    public T poll() {
        if(tail < size / 3) {
            downSize();
        }
        T returnVal = store[START_POSITION];
        swap(START_POSITION,tail);
        sinkDown();
        return returnVal;
    }
    private void swap(int pos1, int pos2) {
        T temp = store[pos2];
        store[pos2] = store[pos1];
        store[pos1] = temp;
    }

    private void sinkDown() {
        int i = START_POSITION;
//        while (store[i] < Math.max(store[i << 1], store [(i<< 1) + 1]) { // @Check : How to find the maximum of two elements for generic types ??
                                                                                // one way would be to use compareTo or comparator  ... any other better method ??
        T larger ;
//        if( ((T)store[i<<2]). // @Check : comparable kaise declare karenge isko ... Class pe hai ye generic type to. Wahaan pe arugument capture with extends daal nahi sakte
        // Priority Queue mein cast to Comparable kiye hue hain of the element.
        while (store[i] < Math.max(store[i << 1], store [(i<< 1) + 1]) {

        }
    }

    private void swimUp() {
        int i = tail;
        do {
            Comparable<? super T> key = (Comparable<? super T>) store[i];
            if(key.compareTo(store[i>>1]) > 0) { swap(i, i>>2); }
            else break;
        }while(i < START_POSITION );
    }

    public boolean isEmpty() {
        return !(tail >= START_POSITION);
    }

    public int getSize() {
        return tail - START_POSITION + 1;
    }

    private void upSize() {
        size <<= 1;
        store = Arrays.copyOf(store, size);
    }

    private void downSize() {
        size >>= 1;
        store = Arrays.copyOf(store, size);
    }

}
