package Problems;

public class EvenNumAtEvenIndex {

    public static void main(String[] args){
        int[] a = {1,2,4,6,9,8,3,7,8};
        int i;
        int j=0;
        int[] b = new int[a.length];

        for(i=0; i<a.length; i++){
            if(a[i]%2==0 && i%2==0){
                b[j++]=a[i];
            }
        }
        for(i=0;i<j;i++)
        System.out.println(b[i]);
    }
}
