package Array;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
     System.out.println("enter the size of array");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int []arr=new int[n];
     System.out.println("enetr array elemnt");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    System.out.println(sum);
    }

}
