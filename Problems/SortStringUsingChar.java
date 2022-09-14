package Test;

import java.util.ArrayList;
import java.util.List;

public class SortStringUsingChar {

    public static List<String> compare(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int lmin = Math.min(l1, l2);
        String temp;
        List<String> retList = new ArrayList<>();
        for (int i=0; i<lmin; i++){

            int s1_ch = (int)s1.charAt(i);
            int s2_ch = (int)s2.charAt(i);
            if (s1_ch == s2_ch){
                continue;
            }else if(s1_ch > s2_ch){
                temp=s1;
                s1=s2;
                s2=temp;
                break;
            }
            else{
                break;
            }
        }
        retList.add(s1);
        retList.add(s2);
        return retList;
    }

    public static void main(String[] args) {

        List<String> mainlist = new ArrayList<>();
        mainlist.add("apple");
        mainlist.add("mango");
        mainlist.add("banana");
        mainlist.add("zebra");
        mainlist.add("applet");
        mainlist.add("mangnet");
        mainlist.add("whiskey");
        mainlist.add("wish");

        List<String> listNew = new ArrayList<>();

        int i,j;
        char temp;
        String str1="";
        String str2="";
        for (i=0; i<mainlist.size();i++){
            for (j=i+1; j<mainlist.size();j++) {
                listNew = compare(mainlist.get(i), mainlist.get(j));
                str1=listNew.get(0);
                str2=listNew.get(1);
                mainlist.set(i,str1);
                mainlist.set(j,str2);
            }
        }
        for (i=0;i<mainlist.size();i++)
        System.out.println(mainlist.get(i));
    }
}
