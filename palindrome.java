import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
       if(ispalindrome(number)){
        System.out.println(number +"is a palindrome ");
       }
       else{
        System.out.println(number+"is not a palindrome ");
       }
    }
public static boolean ispalindrome(int n){
    int originalNumber=n;
    int reverse=0;
    while(n>0){
        int digit=n%10;
        reverse=reverse*10+digit;
        n=n/10;
    }
    return originalNumber==reverse;
}
}