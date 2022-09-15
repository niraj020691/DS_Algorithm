package Problems;

public class ZeroesLeftOnesRight {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,0,0,1,0,0};
        int n= arr.length-1;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                while(arr[n]!=0){
                    n--;
                }
                int temp = arr[i];
                arr[i]=arr[n];
                arr[n]=temp;
                n--;
            }
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]);
        }
    }
}
