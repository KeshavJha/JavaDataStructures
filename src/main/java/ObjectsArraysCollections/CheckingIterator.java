package ObjectsArraysCollections;

import java.util.Iterator;
import java.util.List;

public class CheckingIterator {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2,3,4,5,6,7,8,9,10); // @CHECK : Any better way of doing this using IntStream , ya IntSupplier ??
        List<Integer> oddInts = List.of(1,2,3,4,5,6,7,8,9,10,11);
        iterateAndPrintErroneously(ints);
        iterateAndPrintCorrectly(ints);
        iterateAndPrintErroneously(oddInts); // @NOTE : Will fail with NoSuchElementException , as one of the two next() calls will be unable to work.
    }
    private static <T> void iterateAndPrintErroneously(List<T> list) {
        for(Iterator<T> it = list.iterator(); it.hasNext(); it.next()) {
            System.out.print(it.next() + ", "); // it.next() is called at two places , so value printed increases by 2
            // Will fail for lists with odd number of values in it.
        }
        System.out.println();
    }

    private static <T> void iterateAndPrintCorrectly(List<T> list) {
        for(Iterator<T> it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next() + ", "); // Calling the iterator.next() function only once , which returns the next element and proceeds to the next position.
        }
        System.out.println();
    }
}
