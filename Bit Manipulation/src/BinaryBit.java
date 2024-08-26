public class BinaryBit {
    public static void main(String[] args) {
        /*
            AND(&) = If both are 1 then result is 1
            OR(|) = If both are 0 then result is 0
            XOR(^) = If both are same either 0 or 1 then result is 0
         */
        System.out.println("Binary AND is: " + (5 & 6));
        System.out.println("Binary OR is: " + (5 | 6));
        System.out.println("Binary XOR is: " + (5 ^ 6));

        /*
            If 1's complement MSB is 1 mean negative
            then we have to find it's 2's complement.
         */
        System.out.println("\nBinary 1's complement is: " + (~5));

        /*
            Left(<<) = a * 2^b
            Right(>>) = a / 2^b
         */
        System.out.println("\nLeft Shift is: " + (5 << 2));
        System.out.println("Right Shift is: " + (6 >> 1));
    }
}
