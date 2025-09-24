package Array;

public class SingleNumber {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,3,4,4,4,4,5,5,6,6,7};
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}
