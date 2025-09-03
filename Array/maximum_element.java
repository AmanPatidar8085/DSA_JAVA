package Array;
import java.util.Scanner;
public class maximum_element {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elemt");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
int max=0;
for(int i=0;i<n;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
System.out.println(max);
    }
}
