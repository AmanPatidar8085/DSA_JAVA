package Array;

public class EvenOdd1 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int []temp=new int[arr.length];
       int index=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
               temp[index++]=arr[i];
           }
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]%2==1){
               temp[index++]=arr[i];
           }
       }
       for(int i=0;i<arr.length;i++){
           arr[i]=temp[i];
       }
       for(int ele:arr){
        System.out.print(ele+" ");
       }
    }
}
