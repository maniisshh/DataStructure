package strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "wowwow";
        if (checkPalindrome(str)) {
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }

    private static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
