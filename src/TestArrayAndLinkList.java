import java.awt.*;
import java.util.*;
import java.util.List;

public class TestArrayAndLinkList {
    public static void main(String[] args) {
        List<Object> arraylist = new ArrayList<>();
        arraylist.add(0, 1);
        arraylist.add(1, 2);
        arraylist.add(2, 3);
        arraylist.add(3, "red");
        arraylist.add(1, "blue");
        System.out.println("the arrayList is:" + arraylist);

        LinkedList<Object> linkedList = new LinkedList<>(arraylist);
        linkedList.add(1, "yellow");
        linkedList.addFirst(45);
        linkedList.removeLast();
        System.out.println("linkedList is: " + linkedList);

        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println( listIterator.next());

        }
        listIterator=linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious())
            System.out.println( listIterator.previous());

    }
}
