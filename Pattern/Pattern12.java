package Pattern;
import java.util.Scanner;
public class Pattern12 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of rows");
    int n1=sc.nextInt();
    for(int i=1;i<n1;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      for(int j=1;j<=2*(n1-i);j++){
        System.out.print(" ");
      }
      for(int j=i;j>=1;j--){
        System.out.print(j);
      }
      System.out.println(" ");
    }
  }  
}
