package Pattern;
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of rows");
        int n1=sc.nextInt();
        System.out.println("enter the size of col");
        int n2=sc.nextInt();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
