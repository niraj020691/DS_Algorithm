package Test;

public class RightShiftArrayRotation {

    public static void main(String[] args){

        int[] a = {1,2,3,4,5,6};
        int len = a.length;
        int i;
        int j;
        int temp;
        int n=6;

        for(i=0; i<n; i++){
            temp = a[len - 1];
            for(j=0; j < len-1; j++){
                a[len-j-1] = a[len-j-2];
            }
            a[0]=temp;
        }
        for(int x=0;x<len;x++)
            System.out.print(a[x]);
    }
}
