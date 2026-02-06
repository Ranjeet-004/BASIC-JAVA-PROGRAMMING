
import java.util.*;
public class subarray {
    public static void printSubarray(int num[]){
        for(int i=0;i<num.length;i++){
            int start=num[i];
            for(int j=i+1;j<=end;k++){
                System.out.print( num[k]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,11,16,10};
    }
}
