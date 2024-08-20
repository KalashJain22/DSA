import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the another string: ");
        String str2 = input.nextLine();

        char[] t1 = str1.toLowerCase().toCharArray();
        char[] t2 = str2.toLowerCase().toCharArray();

        if(t1.length == t2.length) {
            Arrays.sort(t1);
            Arrays.sort(t2);
            if(Arrays.equals(t1, t2)) {
                System.out.println("Both of the string are anagrams.");
            } else {
                System.out.println("Both of the strings are not anagrams.");
            }
        } else {
            System.out.println("Both of the strings are not anagrams.");
        }
    }
}
