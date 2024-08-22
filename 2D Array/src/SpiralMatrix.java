public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printSpiral(arr);
    }

    public static void printSpiral(int[][] arr) {
        int staRow = 0;
        int staCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(staRow <= endRow && staCol <= endCol) {
            for(int j = staCol; j <= endCol; j++) {
                System.out.print(arr[staRow][j] + " ");
            }
            for(int i = staRow+1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            for(int j = endCol-1; j >= staCol; j--) {
                if(staRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
            for(int i = endRow-1; i >= staRow+1; i--) {
                if(staCol == endCol) {
                    break;
                }
                System.out.print(arr[i][staCol] + " ");
            }
            staCol++;
            staRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
}
