package Subarrays;
import java.util.Scanner;
public class subarraysum {
  public static void main(String[] args) {
    System.out.println("enter the size of array");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the element of array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                sum+=arr[k];
            }
            System.out.print(sum+"  ");
        }
        System.out.println();
    }
    System.out.println();
  }  
}
