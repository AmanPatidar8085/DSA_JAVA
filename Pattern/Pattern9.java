package Pattern;
import java.util.*;
public class Pattern9{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size of row");
    int n1=sc.nextInt();
    for(int i=0;i<n1;i++){
        for(int j=0;j<n1-i-1;j++){
            System.out.print(" ");
        }
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        for(int j=0;j<n1-i-1;j++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }
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