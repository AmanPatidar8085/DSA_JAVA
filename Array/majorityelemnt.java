package Array;
import java.util.*;
public class majorityelemnt {
    public static void main(String[] args) {
        int arr[]={1,3,1,1,4,1,1,2,2,2,5,6};
        Arrays.sort(arr);
        int freq=1;
        int ans=arr[0];
for(int i=1;i<arr.length;i++){
    if(arr[i]==arr[i-1]){
freq++;
    }
    else{
        freq=1;
        ans=arr[i];
    }
    if(freq>arr.length/2){
        System.out.println(ans);
    }
}
System.out.println(ans);
    }
}
