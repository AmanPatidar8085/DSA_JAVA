package Subarrays;
import java.util.Scanner;
public class Subarraysumk {
    public static void main(String[] args) {
        System.out.println("enter the  size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter k");
        int k=sc.nextInt();
        System.out.println("enter array elemnts");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
int len=0;
for(int i=0;i<n;i++){
    int sum=0;
    for(int j=i;j<n;j++){
        sum+=arr[j];
        if(sum==k) len++;
    }
}
System.out.println(len);

    }
}
