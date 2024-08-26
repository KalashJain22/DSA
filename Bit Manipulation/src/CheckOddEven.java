import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the value: ");
        int num = input.nextInt();
        int bitMask = 1;

        /*
            If lsb after & operator is 0 then number is
            even else number is odd.
         */
        if((num & bitMask) == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}
