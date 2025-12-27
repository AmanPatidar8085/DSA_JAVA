package Pattern;
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of row");
        int n1=sc.nextInt();
        System.out.println("enetr the size of colmn");
        int n2=sc.nextInt();
        for(int i=5;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
