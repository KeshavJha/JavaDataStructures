package learningAlgorithms.heap;

public class UsingSampleQueue {
    public static void main(String[] args) {
        SampleQueue<String> strs = new SampleQueue<>();
        strs.enqueue("str1");
        strs.enqueue("str2");
        strs.enqueue("str1");
        strs.enqueue("str3");
        System.out.println(strs.dequeue() );
        System.out.println(strs.dequeue() );
        System.out.println(strs.dequeue() );
    }
}
