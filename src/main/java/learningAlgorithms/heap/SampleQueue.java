package learningAlgorithms.heap;

public class SamplePriorityQueue<T> {
    QueueNode<T> head;
    QueueNode<T> tail;

    public SamplePriorityQueue() {
        head = tail = null;
    }

    public SamplePriorityQueue(T element) {
        head = tail = new QueueNode<>(element);
    }

    public void enqueue(T newEntry) {
        if ( tail != null) {
            tail.next = new QueueNode<>(newEntry, tail, null);
            tail = tail.next;
        } else {
            head = tail = new QueueNode<>(newEntry);
        }
    }

    public T dequeue() {
        if( head != null) {
            T value = head.value;
            if(head.next != null ) head.next.previous = null ;
          head = head.next;
          return value;
        } // Instead of null , Optional return karega .
        else return null;
    }

    private void doNothing() {
        return;
    }

}

class QueueNode<T> {
    T value;
    QueueNode<T> next;
    QueueNode<T> previous;

    QueueNode(T val) {
        value = val;
    }
    QueueNode(T val, QueueNode<T> next, QueueNode<T> prev) {
        value = val;
        this.next = next;
        this.previous = prev;
    }
}