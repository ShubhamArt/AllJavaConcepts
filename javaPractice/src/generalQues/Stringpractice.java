package generalQues;

import java.util.Arrays;

public class Stringpractice {
    public static void main(String[] args) {
        //revrse string and palindrome string
        String str = "Shubham";
        int start = 0;
        int end = str.length() - 1;
        char[] charArray = str.toCharArray();
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reverseString = new String(charArray);
        if (reverseString.equals(str))
            System.out.println("Palindrome");
        else System.out.println("not palindrome");

        ///isogram string
        String s1 = "pen";
        char[] charArray1 = s1.toCharArray();
        boolean isIsogram = true;
        for (int i = 0; i < s1.length() - 1; i++) {
            if (charArray1[i] == charArray1[i + 1])
                isIsogram = false;
        }
        System.out.println(isIsogram);

        ///anagram string
        anagramString();
        //rotation of String
        rotationOfString();
        //find substring

        findSubstring();
    }

    private static void findSubstring() {
        String input="abc";
        for(int start=0;start<input.length();start++){
            for(int end=start;end<input.length();end++){
                for(int i=start;i<=end;i++){
                    System.out.print(input.charAt(i));
                }
                System.out.println();
            }

        }
    }

    private static void rotationOfString() {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        if (s1.length() != s2.length())
            System.out.println("Strings are not rotational");

        String concatString = s1 + s1;
        if (concatString.contains(s2))
            System.out.println("Strings are rotational ");
        else
            System.out.println("Strings not ratational");
    }

    private static void anagramString() {
        String s1 = "listen";
        String s2 = "silent";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if (c1.length != c2.length) {
            System.out.println("String is not anagram ");
            System.exit(0);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i])
                System.out.println("Strings are not anagram");
        }
        System.out.println("Strings are anagram");
    }
}
