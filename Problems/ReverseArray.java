package Problems;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};
        int n = arr.length-1;
        for(int i=0; i<n; i++){
            int temp = arr[i];
            arr[i]=arr[n];
            arr[n]= temp;
            n--;
        }
        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]);
        }
    }
}
