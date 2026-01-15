package Pattern;

public class Pattern22 {
   public static void main(String[] args) {
    int n=11;
    int val=1;
    for(int i=0;i<n;i++){
        if(i<=n/2){
            System.out.print(val);
            val++;
        }
        else{
            System.out.print(n-i);
        }
        System.out.print(" ");
    }
    
   } 
}
