package Array;
public class LastOcc {
   public static void main(String[] args) {
    int count=0;
    int x=5;
    int []arr={1,5,5,3,5,6};
    for(int i=0;i<arr.length;i++){
         if(x<arr[i]) {
            count++;
         }
    }
    System.out.println(count);
   } 
}
