import java.util.ArrayList;
public class insert {
  public static void main(String[] args) {
    ArrayList<Integer>list1=new ArrayList<>();
    list1.add(10);
    list1.add(15);
    list1.add(20);
    list1.add(30);
    //applying remove method
    list1.remove(2);
    ArrayList<String>list2=new ArrayList<>();
    list2.add("Hello");
    list2.add("Hey");
    list2.add("Hello World");
    //applying add method
    list2.remove("Hello");
    System.out.println("list1:"+list1);
    System.out.println("list2:"+list2);
  }  
}

