package mphasisQuestion;

import java.util.HashMap;

// clean the strong , count occurance of each character and word length
public class StringQuestionOnReGex {
    public static void main(String[] args) {
        String str = "I am  @shubham   *#%    attending1     interview";
        str = str.replaceAll("[^a-zA-Z ]", "");//This uses a regular expression to match and remove all characters that are not alphabetic letters (lowercase or uppercase) or spaces
        str = str.replaceAll("\\s+", " ").trim();//This regular expression matches one or more consecutive whitespace characters (spaces, tabs, etc.) and replaces them with a single space.
        System.out.println("clean String :" + str);
        System.out.println("count of words in clean string :"+(str.split(" ")).length);
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println("count of each character from clean string :" + map);


    }
}
