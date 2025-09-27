package Subarrays;

public class Maxsubarray {
    public static void main(String[] args) {
        int []arr={7,3,-1,4,6,-8,5,2};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int ans=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            ans=Math.max(ans,sum);
        }
        System.out.println(ans);
    }
}
