package Test;

public class RemoveElementArray {

    public static void main(String[] args){

        int[] a = {1,2,3,4,5,6,7};
        int index = 2;
        int temp[] = new int[a.length];
        int i;
        int j=0;
        for (i=0; i<a.length; i++){
            if(i != index){
                temp[j++]=a[i];
            }
        }
        for(i=0; i<j; i++)
        System.out.println(temp[i]);
    }
}
