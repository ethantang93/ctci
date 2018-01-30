package chapter1;

public class oneAway {
    boolean oneStepAway(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return checkReplace(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return checkInsert(str1, str2);
        } else if (str1.length() == str2.length() + 1) {
            return checkInsert(str1, str2);
        }
        return false;
    }

    boolean checkReplace(String str1, String str2) {
        boolean foundDifference = false;
        for (int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    boolean checkInsert(String str1, String str2) {
        int index1=0;
        int index2=0;

        while(index2 < str2.length() && index1 < str1.length()){
            if (str1.charAt(index1) != str2.charAt(index2)){
                if(index1!=index2){
                    return false;
                }
                index2 ++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
