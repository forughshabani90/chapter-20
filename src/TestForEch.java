import java.util.ArrayList;
import java.util.Collection;

public class TestForEch {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("new york");
        collection.add("atlanta");
        collection.add("dallas");
        collection.add("madison");
        collection.forEach(e -> System.out.println(e.toUpperCase() + " "));
    }
}
