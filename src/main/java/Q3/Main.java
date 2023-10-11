package Q3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(8);
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(15);

        System.out.println("before remove: " + numbers);
        removeOrderedCouples(numbers);
        System.out.println("after remove: " + numbers);
    }
    public static void removeOrderedCouples(LinkedList<Integer> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            int left = iterator.next();
            if (iterator.hasNext()) {
                int right = iterator.next();
                if (left > right) {
                    iterator.previous();
                    iterator.previous();
                    iterator.remove(); // remove the left element
                    iterator.next();
                    iterator.remove(); // remove the right element
                }
            }
        }
    }
}
