import java.util.*;
public class addEle {
 public static void main(String[] args) {
ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(10,20,30,40));
int Element=50;
System.out.println("Array before Insertion");
for(int i=0;i<arr.size();i++){
System.out.println(arr.get(i)+"");
}
arr.add(0,Element);
System.out.println("Array after insertion");
for(int i=0;i<arr.size();i++){
    System.out.println(arr.get(i)+"");
 } 
 System.out.println();  
}
}