package chapter1;

public class palindromePermutation {
    public boolean isPalindrome(String str) {
        int[] countSet = new int[128];
        for (int i = 0; i < str.length(); i ++ ) {
            System.out.println("index is " + str.charAt(i));
            countSet[str.charAt(i)] ++;
            System.out.println("countSet is " + countSet[str.charAt(i)]);
        }
        int count = 0;
        for (int i = 0; i< str.length(); i++) {
            if (countSet[str.charAt(i)] % 2 == 1) {
                count ++;
            }
        }
        System.out.println(count);
        return count <= 1;
    }

    public static void main(String[] args) {
        palindromePermutation test = new palindromePermutation();
        boolean result = test.isPalindrome("tacocat");
        System.out.println(result);
    }
}
