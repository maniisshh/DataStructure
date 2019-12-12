package strings;

public class CountVowelsConstants {
    public static void main(String[] args) {
        String str = "this is the simple sentence";
        countVowelsConstants(str);
    }

    private static void countVowelsConstants(String str) {
        int vCount = 0, cCount = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vCount++;
            }else {
                cCount++;
            }
        }
        System.out.println("Total vowels = "+vCount+" Total constant = "+cCount);
    }
}
