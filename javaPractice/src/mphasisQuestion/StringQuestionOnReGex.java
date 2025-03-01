package mphasisQuestion;

import java.util.HashMap;

// clean the strong , count occurance of each character and word length
public class StringQuestionOnReGex {
    public static void main(String[] args) {
        String str = "I am  @shubham   *#%    attending1     interview";
        str = str.replaceAll("[^a-zA-Z ]", "");
        str = str.replaceAll("\\s+", " ").trim();
        System.out.println("clean String :" + str);
        System.out.println("count of words in clean string :"+(str.split(" ")).length);
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println("count of each character from clean string :" + map);


    }
}
