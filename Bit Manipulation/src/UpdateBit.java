public class UpdateBit {
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
    }

    // Left shift 1 at ith for performing & operation.
    public static int getIthBit(int num, int i) {
        int bitMask = 1 << i;
        if((num & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Left Shift 1 at ith for performing | operator.
    public static int setIthBit(int num, int i) {
        int bitMask = 1 << i;
        return num | bitMask;
    }

    // Left Shift 1 at ith and do not of that for performing & operator.
    public static int clearIthBit(int num, int i) {
         int bitMask = ~(1 << i);
         return num & bitMask;
    }

    public static int updateIthBit(int num, int i, int newBit) {
//        if(newBit == 0) {
//            return clearIthBit(num, i);
//        } else {
//            return setIthBit(num, i);
//        }

        num = clearIthBit(num, i);
        int bitMask = newBit << i;
        return num | bitMask;
    }
}
