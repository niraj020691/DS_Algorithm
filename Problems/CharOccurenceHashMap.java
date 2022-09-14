package Problems;

import java.util.HashMap;
import java.util.Map;

public class CharOccurenceHashMap {
    public static void main(String[] args){
        String str="niraj prasad singh";

        char[] a = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c:a){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else{
                map.put(c,1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

