package strings;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
    public static void main(String[] args) {
        String str = "Hello World";
        findDuplicates(str);
    }

    /**
     * Method to find all the duplicates in string
     *
     * @param str
     */
    private static void findDuplicates(String str) {
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (Character ch : charArray) {
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }

        Set<Character> keys = hashMap.keySet();
        for (Character ch : keys) {
            if (hashMap.get(ch) > 1) {
                System.out.println(ch + " is " + hashMap.get(ch) + " times");
            }
        }
    }
}
