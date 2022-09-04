package Test;

import java.util.HashMap;

public class MorseCodeUsingMap {

    public static void main(String[] args) {
        String[] wordArray = {"gin", "zen", "gig", "msg"};
        String str = "abcdefghijklmnopqrstuvwxyz";
        String[] code = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char[] strCha = str.toCharArray();
        HashMap<Character, String> map = new HashMap<>();
        int i = 0;
        for (char c : strCha) {
            map.put(c, code[i]);
            i++;
        }
        int k = 0;
        String[] cArray = new String[wordArray.length];
        for (String wordS : wordArray) {
            String ch2 = "";
            char[] ginArray = wordS.toCharArray();
            for (Character ch : ginArray) {
                String ch1 = map.get(ch);
                ch2 = ch2 + ch1;
            }
            cArray[k++] = ch2;
        }
        int count = 0;
        for (int f = 0; f < cArray.length; f++) {
            if(cArray[f].equals("-1")){
                continue;
            }
            for (int g = f + 1; g < cArray.length; g++) {
                if (cArray[f].equals(cArray[g])) {
                    cArray[g] = "-1";
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
