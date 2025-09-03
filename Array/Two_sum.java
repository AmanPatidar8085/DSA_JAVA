package Array;
import java.util.Scanner;

public class Two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();
        }

        boolean found = false; 

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("true");
                    found = true;
                    break;  // exit inner loop
                }
            }
            if (found) break; // exit outer loop too
        }

        if (!found) {
            System.out.println("false");
        }
    }
}
