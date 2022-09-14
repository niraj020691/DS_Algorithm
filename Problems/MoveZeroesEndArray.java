package Test;

public class MoveZeroesEndArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,0,4,0,5,0};
        int n = arr.length-1;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                if(arr[n]==0){
                    n--;
                }
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
                n--;
            }

        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]);
        }
    }
}
