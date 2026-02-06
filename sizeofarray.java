import java.util.ArrayList;
public class sizeofarray {
    public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(5);
    list.add(10);
    System.out.println(list.size());
    for(int i=0;i<list.size();i++){
System.out.println(list.get(i)+" ");
    }
}
}