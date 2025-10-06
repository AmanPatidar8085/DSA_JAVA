package Array;

public class Maxsub {
    public static void main(String[] args) {
        int[] arr = { 3, -5, 2, -1, 4, 6, -8, 3 };
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                    max = Math.max(max, sum);
                }

            }
        }
        System.out.println(max);
    }
}
