package Test;

import java.util.HashSet;
import java.util.Set;

public class MorseCodeUsingSet {
    public static void main(String[] args) {

        String[] wordArray = {"gin", "zen", "gig", "msg"};
        String[] Morse = {".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet<>();
        for(String word: wordArray){
            StringBuffer sb = new StringBuffer();
            for(char c: word.toCharArray()){
                sb.append(Morse[c-'a']);
            }
            seen.add(sb.toString());
        }
        System.out.println(seen.size());
        System.out.println(seen);
    }
}
