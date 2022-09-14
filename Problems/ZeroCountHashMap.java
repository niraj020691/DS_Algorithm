package Test;

import java.util.HashMap;

public class ZeroCountHashMap {

        public static void main(String[] args) {

        String str = "10010001000001001000000010001";
        int count=0;
        int max=0;
        int finalC=0;
        int[] fa = new int[10];
        int k=0;
        int all=0;

        char[] carr = str.toCharArray();
        int[] ar = new int[carr.length];
        for(int i=0;i<carr.length;i++){
            ar[i] = Character.getNumericValue(carr[i]);
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer c : ar){
            if (map.containsKey(c)) {
                if(c==0) {
                    map.put(c, map.get(c) + 1);
                    if (max < map.get(c)) {
                        max = map.get(c);
                    }
                }
                if(c==1){
                    count=max;
                    fa[k]=count;
                    k++;
                }
            } else {
                map.put(c, 1);
            }
        }
        for(int h=0;h<k;h++){
            if(fa[h+1]>fa[h]){
                finalC=fa[h+1]-fa[h];
                if(all<finalC){
                    all=finalC;
                }
            }
        }
        System.out.println(all);
    }
}
