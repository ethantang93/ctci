package chapter1;

public class uRLify {
    String urlify(char[] str, int realLength) {
        int spaceCount = 0;
        int index;
        for (int i = 0; i < realLength; i++) {
            if(str[i] == ' ') spaceCount++;
        }
        index = realLength + 2 * spaceCount;
        System.out.println(spaceCount);
        for (int i = realLength - 1; i >= 0; i--) {
        System.out.println(index);
        System.out.println(i);
        System.out.println(str[i]);
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        return new String(str);
    }

    public static void main(String[] args) {
        uRLify test = new uRLify();
        char[] data = "Mr John Smith    ".toCharArray();
        System.out.println(test.urlify(data, 13));
    }
}
