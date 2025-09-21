package Array;
import java.util.Scanner;
public class MovesZeors {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the elemnt in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
      for(int ele:arr){
        System.out.print(ele+" ");
      }
System.out.println();
    }
}
