package Q1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.next().toUpperCase();
        // create a HashMap to store the count of each character in the input word
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            characterMap.put(ch, characterMap.getOrDefault(ch, 0) + 1);
        }
        permutation(characterMap, "", word.length());

        //
        System.out.println("Enter two words:");
        String word1 = scanner.next().toUpperCase();
        String word2 = scanner.next().toUpperCase();
        if (canTransformIntoEachOther(word1, word2)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    private static void permutation(HashMap<Character, Integer> charRepeat, String current, int length) {
        if (current.length() == length) {
            System.out.println(current);
            return;
        }
        // recursive
        for (char c : charRepeat.keySet()) {
            int count = charRepeat.get(c);
            if (count > 0) {
                charRepeat.put(c, count - 1);
                permutation(charRepeat, current + c, length);
                charRepeat.put(c, count);
            }
        }
    }

    private static boolean canTransformIntoEachOther(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap<Character, Integer> charRepeat = new HashMap<>();
        for (char c : word1.toCharArray()) {
            charRepeat.put(c, charRepeat.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            if (charRepeat.containsKey(c)) {
                int count = charRepeat.get(c);
                if (count > 0) {
                    charRepeat.put(c, count - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
