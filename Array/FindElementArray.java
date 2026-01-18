package Array;

public class FindElementArray {
    public static void main(String[] args) {
        int[] arr={1,22,13,45,66,77,88,99,5,3};
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
                if(arr[i]>largest){
                 largest=arr[i];
                }
            
        }
        System.out.println(largest);
    }
}
