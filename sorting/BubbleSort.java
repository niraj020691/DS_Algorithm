package sorting;

// SWAPPING METHOD
public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {6, 2, 9, 8, 7, 10};
        int temp = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}


