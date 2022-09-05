package Test;

public class MonotonicArray {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,6,4};
        boolean inc = true;
        boolean dec = false;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                dec = false;
            }
            if(arr[i]>arr[i+1]){
                inc = false;
            }
        }
        if(inc || dec){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
