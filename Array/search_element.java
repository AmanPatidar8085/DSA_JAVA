package Array;
import java.util.Scanner;
public class search_element {
    public static void main(String[] args) {
       System.out.println("enter the size of array");
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       System.out.println("traget element");
       int target=sc.nextInt();
       int [] arr=new int[n];
       System.out.println("enter array elemt");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
          }
          int ans=0;
          for(int i=0;i<n;i++){
          if(target==arr[i]){
            ans=i;

          }
          }
          System.out.println(ans);

    }
}
