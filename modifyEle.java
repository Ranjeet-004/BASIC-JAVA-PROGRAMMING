
public class modifyEle {
   public static void main(String[] args) {
    int marks[]={90,96,93,92,91};
    int n=marks.length;
    for (int i= 0; i<n; i++){
    marks[i]+=2;
    }
    System.out.println("modified array");
    for (int i= 0; i<n; i++){
    System.out.println(marks[i]+"");
    }  
    System.out.println();
}
}
   

