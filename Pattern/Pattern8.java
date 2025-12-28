package Pattern;
import java.util.*;
public class Pattern8{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size of row");
    int n1=sc.nextInt();
    // System.out.println("enter the size of col");
    // int n2=sc.nextInt();
    for(int i=0;i<n1;i++){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<2*n1-(2*i+1);j++){
            System.out.print("*");
        }
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }
   }
}