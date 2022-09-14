package Test;

public class BinaryZeroMaxCount {

    public static void main(String[] args) {

        String num = "100101000010001000001";
        //int num=10010001;
        char[] chArr = num.toCharArray();
        //char[] chArr = ("" + num).toCharArray();
        //char[] chArr = (""+num).toCharArray();
        int[] arr = new int[chArr.length];
        for (int i = 0; i< chArr.length; i++) {
            arr[i] = Character.getNumericValue(chArr[i]);
        }
        for(int j =0; j<arr.length;j++){
            System.out.print(arr[j]);
        }

        int count =0;
        int max =0;
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                for(j=i; arr[j]<1; j++){
                    count++;
                }
            }
            i=j;
            if(max<count){
                max=count;
            }
            count=0;
        }
        System.out.println(max);
    }
}
