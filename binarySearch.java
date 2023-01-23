import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class binarySearch {
    public static int binary(int arr[], int low, int high, int x) {
        int mid = (high + low) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binary(arr, low, mid, x);
        } else {
            return binary(arr, mid, high, x);
        }
        // return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tem = sc.nextInt();
        tem = binary(arr, s, n, tem);
        System.out.println("Element found at " + tem);
        sc.close();
    }

}
