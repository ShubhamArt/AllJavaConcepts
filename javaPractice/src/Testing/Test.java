package Testing;


public class Test {
    public static void main(String[] args) {
        String str = "I am  @shubham   *#%    attending1     interview";
         str = str.replaceAll("[^a-zA-Z ]", "");
         str= str.replaceAll("\\s+"," ").trim();
        System.out.println(str);
    }
}
