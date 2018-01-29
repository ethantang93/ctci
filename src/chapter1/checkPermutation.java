package chapter1;

import java.util.Arrays;

public class checkPermutation {
    boolean isPermutation(String str1, String str2) {
        if (str1.length() != str1.length()) {
            return false;
        }
        int[] charSet1 = new int[128];
        int[] charSet2 = new int[128];

        for (int i = 0; i<str1.length(); i++) {
//            using the character's position in ascii code as key for the hash map
            int key1 = str1.charAt(i);
            int key2 = str2.charAt(i);
            charSet1[key1]++;
            charSet2[key2]++;
        }
        return Arrays.equals(charSet1, charSet2);
    }

    public static void main(String[] args){
        checkPermutation test = new checkPermutation();
        boolean result = test.isPermutation("abc", "bba");
        System.out.println(result);
    }

}
