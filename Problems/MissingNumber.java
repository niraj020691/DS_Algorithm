package Test;

public class MissingNumber {

    static int getMissingNo (int a[], int n)
    {
        int i, total;
        total  = (n + 1) * (n + 2) / 2;
        for ( i = 0; i < n; i++)
        total -= a[i];
        return total;
    }
    public static void main(String... s)
    {
        int a[ ] = {1, 2, 4, 5, 6, 7, 8};
        int miss = getMissingNo(a, 7);
        System.out.println("The number missing is :"+miss);
    }
}
