package AltimetricQuestion;

public class SortStringWithoutAnyInbuiltMethod {
    public static void main(String[] args) {
        String input = "mbcadcafkkjj";
        int n = input.length();
        char[] arr = new char[input.length()];
        for (int i = 0; i < n; i++) {
            arr[i] = input.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            stringBuilder.append(arr[i]);
        }
        System.out.println("output : "+stringBuilder.toString());
    }
}
