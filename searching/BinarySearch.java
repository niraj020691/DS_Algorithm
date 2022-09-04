package searching;

public class BinarySearch {

    public static void main(String[] args){

        int a[] = {8, 10, 22, 27, 37, 44, 49, 55, 69}; // given array
        int val = 10; // value to be searched
        int n = a.length; // size of array

        int first=0;
        int last=n-1;
        int mid=(first+last)/2;
        while(first<=last){
            if(a[mid]<val){
                first=mid+1;
            }else if(a[mid]==val){
                System.out.println("Element at "+mid);
                break;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
    }
}
