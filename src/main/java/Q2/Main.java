package Q2;

import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Character> set1 = randomCharacters(10);
        TreeSet<Character> set2 = randomCharacters(10);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        TreeSet<Character> union = findUnion(set1, set2);
        System.out.println("Union of Set 1 and Set 2: " + union);

        TreeSet<Character> intersection = findIntersection(set1, set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersection);
    }

    private static TreeSet<Character> randomCharacters(int number) {
        TreeSet<Character> set = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            char randomChar = (char) ('a' + random.nextInt(26));
            set.add(randomChar);
        }
        return set;
    }

    private static TreeSet<Character> findUnion(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> union = new TreeSet<>(set1);
        union.addAll(set2);
        return union;
    }
    private static TreeSet<Character> findIntersection(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);
        return intersection;

    }
}
