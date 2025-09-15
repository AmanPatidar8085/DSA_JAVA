package Array;
import java.util.Scanner;
public class Removeduplicateelemnt {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elemnt in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
   int i=0;
   for(int j=1;j<n;j++){
    if(arr[j]!=arr[i]){
        i++;
        arr[i]=arr[j];
    }
   }
   System.out.println(i+1);

    }
}
