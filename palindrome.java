import java.util.Scanner;

public class palindrome {
    // given number is a palindrome or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int value = sc.nextInt();
        int r, reverse=0;
        int checker = value;
        while (value > 0) {
            r = value % 10;
            value = value/10;
            reverse = reverse * 10 + r;
        }
        if(checker == reverse)
            System.out.println("This is a Palindrome");
        
        else 
            System.out.println("This is not a Palindrome");
    }

}