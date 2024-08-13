public class PairsInArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 1, 8};
        int pairs = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                pairs++;
            }
            System.out.println();
        }
        
        System.out.println("Total number of pairs are: " + pairs);
    }
}
