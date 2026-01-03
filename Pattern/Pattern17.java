package Pattern;
import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("entre the size of row");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+ " ");
            }
    
            System.out.println(" ");
        }
    }
}