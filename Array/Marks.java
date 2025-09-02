package Array;
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

for(int i=0;i<n;i++){
    if(arr[i]<=35)
    System.out.println(i);
}
    }
    
}
