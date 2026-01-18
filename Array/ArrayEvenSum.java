package Array;
import java.util.Scanner;
public class ArrayEvenSum {
    public static void main(String[] args) {
      System.out.println("enter the size of array");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int []arr=new int[n];
      System.out.println("enter the array element"); 
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      } 
      int sum=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            sum=sum+arr[i];
        }
    }
        System.out.println(sum);
      

    }
}
