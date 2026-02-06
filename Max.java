
import java.util.ArrayList;
public class Max {
    public static void main(String[] args) {
    ArrayList<Integer >list=new ArrayList<>();
    list.add(15);
    list.add(20);
    list.add(30);
    System.out.println(list);
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
    if(max<list.get(i)){
        max=list.get(i);

    }
    }
    System.out.println("Max value is:"+max);
    }
    }
    
    

