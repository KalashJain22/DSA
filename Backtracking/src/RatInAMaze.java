public class RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 1, 0},
                {1, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 0, 1, 1}
        };

        int n = maze.length;
        int[][] sol = new int[n][n];

        if (!solveMaze(maze, sol, 0, 0)) {
            System.out.print("Solution doesn't exist");
        } else {
            printMaze(sol);
        }
    }

    public static boolean solveMaze(int[][] maze, int[][] sol, int x, int y) {
        if(x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            if (sol[x][y] == 1) {
                return false;
            }
            sol[x][y] = 1;
            if (solveMaze(maze, sol, x + 1, y)) {
                return true;
            }
            if (solveMaze(maze, sol, x, y + 1)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static boolean isSafe(int[][] maze, int x, int y) {
        if(x >= 0 && x < maze.length &&
                y >= 0 && y < maze.length &&
                maze[x][y] == 1) {
            return true;
        }
        return false;
    }

    public static void printMaze(int[][] sol) {
        for(int i = 0; i < sol.length; i++) {
            for(int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
}
