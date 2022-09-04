package Test;

import java.util.Arrays;

public class StringPalindromeUsingArrays {

    public static void main(String[] args) {

        String str = "MOMOM";
        char[] myArray = str.toCharArray();
        int size = myArray.length;
        //System.out.println(size/2);
        char[] original = Arrays.copyOf(myArray,myArray.length);

        for (int i = 0; i < size / 2; i++) {
            char temp = myArray[i];
            myArray[i] = myArray[size-i-1];
            myArray[size-i-1] = temp;
        }
        System.out.println("Original Array"+Arrays.toString(original));
        System.out.println("Reverse Array"+Arrays.toString(myArray));
        if(Arrays.equals(myArray, original)) {
            System.out.println("Entered string is a palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }

    }
}
