import java.util.ArrayList;
import java.util.Collections;
public class ArraylList {
   public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
list.add(20);
list.add(130);
list.add(70);
list.add(50);
System.out.println(list);
Collections.sort(list);
System.out.println(list);
Collections.sort(list,Collections.reverseOrder());
   } 
}
