package Arraylist;
import java.util.ArrayList;
public class arraylist1 {
    public static void main(String[] args) {
        
    
  ArrayList<Integer>li =new ArrayList<>(); 
  li.add(1);
  li.add(2);
  li.add(3);
  li.add(4);
  System.out.println(li);
  System.out.println(li.size());
  li.add(2,5);
  System.out.println(li);
  li.add(3,7);
  System.out.println(li);
  System.out.println(li.get(3));
  li.remove(0);
  System.out.println(li);
  li.add(4,4);
  li.add(4,5);
  System.out.println(li);
    }
}
