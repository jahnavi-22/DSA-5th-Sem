package backtracking;

import java.util.Scanner;

public class RatInAMaze {
    private int n;
    private int[][] maze;
    private boolean[][] bMaze;

    public RatInAMaze(int n) {
        this.n = n;
        this.maze = new int[n][n];
        this.bMaze = new boolean[n][n];
    }

    public void createMaze(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maze (1 for open, 0 for closed):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
    }

    public void create_B_Maze(int n) {
        this.bMaze = new boolean[n][n];
    }

    public void maze(int[][] maze, int row, int col, String path, boolean[][] bMaze) {
        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0 || bMaze[row][col]) {
            return;
        }

        // If we reach the end of the maze
        if (row == n - 1 && col == n - 1) {
            System.out.println("Path: " + path);
            return;
        }

        // Mark the current cell as visited
        bMaze[row][col] = true;

        // Move right
        maze(maze, row, col + 1, path + "R", bMaze);

        // Move left
        maze(maze, row, col - 1, path + "L", bMaze);

        // Move down
        maze(maze, row + 1, col, path + "D", bMaze);

        // Move up
        maze(maze, row - 1, col, path + "U", bMaze);

        // Backtrack
        bMaze[row][col] = false;
    }

    public int[][] getMaze() {
        return maze;
    }

    public boolean[][] get_B_Maze() {
        return bMaze;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the maze (N): ");
        int n = scanner.nextInt();

        RatInAMaze obj = new RatInAMaze(n);

        obj.createMaze(n);
        obj.create_B_Maze(n);

        obj.maze(obj.getMaze(), 0, 0, "", obj.get_B_Maze());
    }
}