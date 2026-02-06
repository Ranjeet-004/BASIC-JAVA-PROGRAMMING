public class Xpattern {
 public static void main(String[] args) {
    int n = 20;
    for(int row=1;row<=n;row++){
      for(int col=1;col<=n;col++){
       if(row-col==0||row+col==n+1) {
        System.out.print("*");
       }else{
      System.out.print(" ");
    }
}
 System.out.print("\n"); 
}
    }
}

