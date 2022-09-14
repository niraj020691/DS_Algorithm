package Test;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String originalStr = "NIRAJ";
        char[] cArray = originalStr.toCharArray();

        char[] oArray = Arrays.copyOf(cArray,cArray.length);


        char temp;

        for (int i=0,j=cArray.length-1; i<cArray.length/2; i++,j--){
            temp = cArray[i];
            cArray[i] = cArray[j];
            cArray[j] = temp;
        }
        for(int s=0; s< cArray.length; s++)
            System.out.print(cArray[s]);
        //String sorted = String.valueOf(cArray);
        if(Arrays.equals(oArray, cArray)){
            System.out.println(" palindrome");

        }else{
            System.out.println(" not palindrome");
        }

    }
}
