package generalQues;

import java.util.*;

public class leetcode {
    public static void main(String[] args) {
        List<String> dictionary1 = Arrays.asList("cat", "bat", "rat");
        String sentence1 = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary1, sentence1));
    }
    public static String replaceWords(List<String> dictionary, String sentence) {
        // Create a set for quick lookup of roots
        Set<String> roots = new HashSet<>(dictionary);
        // Split the sentence into words
        String[] words = sentence.split(" ");
        // List to hold processed words
        List<String> resultWords = new ArrayList<>();
        // Process each word in the sentence
        for (String word : words) {
            String root = findShortestRoot(word, roots);
            resultWords.add(root);
        }
        // Join the processed words into a single sentence
        return String.join(" ", resultWords);
    }

    private static String findShortestRoot(String word, Set<String> roots) {
        String shortestRoot = word;
        for (String root : roots) {
            if (word.startsWith(root) && root.length() < shortestRoot.length()) {
                shortestRoot = root;
            }
        }
        return shortestRoot;
    }
}