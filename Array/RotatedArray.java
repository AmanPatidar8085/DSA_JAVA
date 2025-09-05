package Array;

public class RotatedArray {
    public void rotate(int[]arr,int k){
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void reverse(int []arr,int i,int j){
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
}
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8,9};
        int k=4;
        RotatedArray obj = new RotatedArray();
        obj.rotate(arr, 8);

        System.out.println("Rotated Array:");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
