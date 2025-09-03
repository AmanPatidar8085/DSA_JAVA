package Array;
import java.util.Scanner;
public class countgreat_ele {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter elemnt is greter x : ");
        int x=sc.nextInt();
        System.out.println("enter the element in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
        if(arr[i]>x){
            count++;
        }
        }
        System.out.println(count);
    }
}
