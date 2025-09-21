package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class union_Array {
    public static void main(String[] args) {
        System.out.println("enter the size of first array1");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("enter the size of second array2");
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("enter the elemnt in array1");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[n2];
        System.out.println("enter the elemt of array2");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
 int i=0,j=0;
 ArrayList<Integer>res=new ArrayList<>();
while(i<n1 || j<n2){

    while(i>0 && i<n1 && arr1[i]==arr1[i-1]){
        i++;
    }
    while(j>0 && j<n2 && arr2[j]==arr2[j-1]){
        j++;
    }

    if(i>=n1){
        res.add(arr2[j]);
        j++;
        continue;
    }
    if(j>=n2){
        res.add(arr1[i]);
        i++;
        continue;
    }
    if(arr1[i]<arr2[j]){
        res.add(arr1[i]);
        i++;
    }
    else if(arr1[i]>arr2[j]){
        res.add(arr2[j]);
        j++;
    }
    else{
        res.add(arr1[i]);
        i++;
        j++;
    }
}
System.out.println(res);

    }
}
