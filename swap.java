
import java.util.ArrayList;
public class swap {
   public static void Swapped (ArrayList <Integer> list, int idx1, int idx2){ 
    int temp=list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);
   } 
   public static void main(String[]args){
ArrayList<Integer>list=new ArrayList<>();
list.add(5);
list.add(15);
list.add(35);
list.add(45);
list.add(55);
list.add(65);
int idx1=1;int idx2=2;
System.out.println("Before swap:"+list);
Swapped(list,idx1,idx2);
System.out.println("After swap the list:"+list);
   }
}

    