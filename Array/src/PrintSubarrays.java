public class PrintSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 8};
        int sub = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                System.out.print("(");
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                sub++;
                System.out.print(") ");
            }
            System.out.println();
        }
        
        System.out.println("Total number of sub arrays are: " + sub);
    }
}
