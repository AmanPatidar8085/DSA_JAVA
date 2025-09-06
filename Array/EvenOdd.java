package Array;
public class EvenOdd {
  public static void main(String[] args) {
    int []arr={1,2,3,4,5,6,7};
    int i=0;
    int j=arr.length-1;
    while(i<j){
      if(arr[i]%2==1 && arr[j]%2==0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
      if(arr[i]%2==0){
        i++;
      }
      if(arr[j]%2==1){
        j--;
      }
    }
  
      for(int ele:arr){
        System.out.print(ele+ " ");
  }  
  System.out.println();
}
}
