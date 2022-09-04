package Test;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5};
        int n = a.length;

        int[] temp = new int[n];
        int i;
        int j=0;

        for (i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j] = a[i];
                j++;
            }
        }

        temp[j] = a[n - 1];

        // Changing the original array
        for (i = 0; i <= j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
