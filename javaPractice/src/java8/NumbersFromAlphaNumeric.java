package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersFromAlphaNumeric {
    public static void main(String[] args) {
        //print only numbers from alphanumeric char array
        Character[] alphaNumericArray={'a','1','b','2','c'};
        List<Character> onlyNumbers = Arrays.stream(alphaNumericArray).filter(Character::isDigit).collect(Collectors.toList());
        System.out.println(onlyNumbers);

        //print only characters from alphanumeric char array
        Arrays.stream(alphaNumericArray).filter(Character::isAlphabetic).toList().forEach(System.out::println);

        String[] arr={"a","1","b","2","c"};
        List<String> digitList = Arrays.stream(arr).filter(x -> x.matches("\\d")).toList();
        System.out.println(digitList);
        List<String> isCharacter = Arrays.stream(arr).filter(x -> x.matches("[a-zA-Z]")).toList();
        System.out.println(isCharacter);
        
        String str = "1253679907c";

        boolean containsOnlyDigits = IntStream.range(0, str.length())
                .mapToObj(str::charAt)  // Convert each character to a Character object
                .allMatch(Character::isDigit);  // Check if all characters are digits

        if (containsOnlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }
    }
}
