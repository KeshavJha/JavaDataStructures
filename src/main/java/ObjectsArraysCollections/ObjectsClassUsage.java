import java.util.Objects;

public class ObjectsClassUsage {
    public static void main(String[] args) {
        String str = "hello";
        Objects.requireNonNull(str);
        str = null;
        Objects.requireNonNull(str);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
