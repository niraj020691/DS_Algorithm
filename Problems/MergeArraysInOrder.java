package Test;

public class MergeArraysInOrder {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 8, 9, 13};
        int b[] = {2, 3, 5, 6, 7};

        int totalLen = (a.length + b.length);
        int c[] = new int[totalLen];

        int i=0;
        int j=0;
        int k=0;
        int temp;

        while(i!=a.length)
        {
            c[k++]=a[i++];
        }
        while(j!=b.length)
        {
            c[k++]=b[j++];
        }

        // sorting method

        for(i=0;i<totalLen;i++){
            for(j=i+1;j<totalLen;j++){
                if(c[i]>c[j]){
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
            System.out.println(c[i]);
        }
    }
}
