public class searchingEle {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    int n=arr.length;
    int Target=6;
    boolean found=false;
    for(int i=0;i<n;i++){
    if(arr[i]==Target){
    found =true;
    break;
    }
    }
    if(found){
        System.out.println("found element");
    }
    else{
        System.out.println("element not found");
    }
    }
    }  
    
