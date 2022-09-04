package sorting;

import java.util.*;

public class SortingHashMap {

    public static void main(String[] args){

        Map<Integer,String> nameMAP = new HashMap<>();
        nameMAP.put(1,"a");
        nameMAP.put(2,"c");
        nameMAP.put(4,"b");
        nameMAP.put(3,"e");
        nameMAP.put(5,"d");
        nameMAP.put(6,"###$");
        nameMAP.put(7,"A");

        System.out.println("original map::::::");
        nameMAP.forEach((k,v)-> System.out.println(k+"\t"+v));


        Set<Map.Entry<Integer,String>> entryset = nameMAP.entrySet();
        List<Map.Entry<Integer,String>> list = new ArrayList<>(entryset);
        list.sort(new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println("sorted map:::::::");
        list.forEach(s-> System.out.println(s.getKey()+"\t"+s.getValue()));

    }
}
