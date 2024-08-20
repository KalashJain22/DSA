import java.util.Scanner;

public class ContainsVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the string: ");
        String str = input.nextLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in the string is: " + count);
    }
}
