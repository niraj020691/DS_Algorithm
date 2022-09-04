package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = new int[]{55, 29, 10, 40, 57, 41, 20, 24, 45};
        int val = 20;
        int n = a.length;

        for(int i = 0; i < n; ++i) {
            if (a[i] == val) {
                System.out.println("At position "+i);
            }
        }

    }
}
