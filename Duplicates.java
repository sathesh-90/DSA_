import java.util.*;


public class C {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3}; 
        int i = 0;

        for (int p = 1; p < arr.length; p++) {
            if (arr[p] != arr[i]) {
                i++;
                arr[i] = arr[p];
            }
        }

        System.out.println("Unique count: " + (i + 1));
        System.out.print("Unique elements: ");
        for (int j = 0; j <= i; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
