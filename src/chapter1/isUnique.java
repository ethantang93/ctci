package chapter1;

public class isUnique {
    boolean isUniqueCharacters(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] characters = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println(val);
            if (characters[val]) {
                return false;
            }
            characters[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("starting test");
        isUnique test = new isUnique();
        boolean result = test.isUniqueCharacters("abcdefghijklmnopqrstuvwxyz");
        System.out.println(result);
    }
}
