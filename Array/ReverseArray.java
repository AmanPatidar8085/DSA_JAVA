package Array;
import java.util.Scanner;
public class ReverseArray {
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("enter the array size");
    Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int []arr=new int [n];
 System.out.println("enter the array elemnt");
 for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
 }
 int i=0,j=n-1;
 while(i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
 }
 print(arr);
    }
}
