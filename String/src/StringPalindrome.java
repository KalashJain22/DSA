import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string you want to check: ");
        String str = input.nextLine();
        for(int i = 0; i <= str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("Given String is not palindrome.");
                return;
            }
        }
        System.out.println("Given String is Palindrome.");
    }
}
