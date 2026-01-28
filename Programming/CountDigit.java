package Programming;

public class CountDigit {
    public static void main(String[] args) {
        int sum=0;
        int n=12354;
        while(n>0){
         int digit=n%10;
         sum=sum+digit;
         n=n/10;
        }
        System.out.println(sum);
    }
}
