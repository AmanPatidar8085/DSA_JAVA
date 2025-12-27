package Pattern;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
  System.out.println("enter the size of row");
  int n1=sc.nextInt();
  System.out.println("enter the of column ");
  int n2=sc.nextInt();
  for(int i=0;i<n1;i++){
    for(int j=0;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println(" ");
  }
    }
}
