import java.util.*;

public class mergeSort {
    static void print(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Bubble Sort:\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
        sort(arr, n);
        print(arr);
        sc.close();
    }
}
