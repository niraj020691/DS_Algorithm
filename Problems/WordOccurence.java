package Test;

import java.util.HashMap;
import java.util.Map;

public class WordOccurence {

    public static void main(String[] args) {

        String str = "niraj is a good boy , niraj is a java developer";

        String[] astr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String ha : astr) {
            if (map.containsKey(ha)) {
                map.put(ha, map.get(ha) + 1);
            } else {
                map.put(ha, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((Integer) entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }

        }

    }
}


