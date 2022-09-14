package Test;

public class SplitArrayIndexPosition {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int index = 7;
        int[] arr1 = new int[index+1];
        int secondArrLen= arr.length-index;
        int[] arr2 = new int[secondArrLen];
        int j=0;

        for(int i =0; i<arr.length; i++){
            if(i<index){
                arr1[i] = arr[i];
            }else{
                arr2[j++] = arr[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(" "+arr1[i]);
        }
        for(int i=0;i<secondArrLen;i++){
            System.out.print("\n+"+arr2[i]);
        }
    }
}
