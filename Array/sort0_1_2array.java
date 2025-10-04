package Array;
import java.util.Scanner;
public class sort0_1_2array {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elemnt in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count0=0;
        int  count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)count0++;
            else if(arr[i]==1) count1++;
            else count2++;
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<count0+count1;i++){
            arr[i]=1;
        }
        for(int i=count0+count1;i<n;i++){
            arr[i]=2;
        }
        for(int nums:arr){
        System.out.print(nums+ " ");
        }
        System.out.println();
    }
}
