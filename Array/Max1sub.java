package Array;

public class Max1sub {
    public static void main(String[] args) {
        int[] arr = { 3, -5, 2, -1, 4, 6, -8, 3 };
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                max=Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
}
