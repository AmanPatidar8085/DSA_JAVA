package Pattern;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row");
        int n1=sc.nextInt();
        System.out.println("enter the size of col");
        int n2=sc.nextInt();
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println(" ");
        }
    }
}
