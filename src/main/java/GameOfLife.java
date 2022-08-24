public class GameOfLife {

    static String converter(String[][] cells) {
        int width = 10, height = 10;
        int[][] grid = new int[width][height];

        for (int i = 0; i < 10; i++) {
            for (int x = 0; x < 10; x++) {
                if (cells[i][x].equals("+")) {
                    grid[i][x] = 0;
                } else grid[i][x] = 1;
            }
        }
        System.out.println("Original Generation");
        System.out.println(generationPrint(width, height, grid));
        System.out.println();
        System.out.println(nextGeneration(grid, width, height));
        return nextGeneration(grid, width, height);
    }
    static String generationPrint(int m, int n, int[][] grid) {
        StringBuilder generation = new StringBuilder();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    generation.append("+");
                else
                    generation.append("#");
            }
            generation.append("\n");
        }
        return String.valueOf(generation);
    }

    static String nextGeneration(int[][] grid, int x, int y) {
        int[][] nextGeneration = new int[x][y];
        for (int l = 1; l < x - 1; l++) {
            for (int m = 1; m < y - 1; m++) {
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        aliveNeighbours += grid[l + i][m + j];
                aliveNeighbours -= grid[l][m];
                if ((grid[l][m] == 1) && (aliveNeighbours < 2))
                    nextGeneration[l][m] = 0;
                else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
                    nextGeneration[l][m] = 0;
                else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
                    nextGeneration[l][m] = 1;
                else
                    nextGeneration[l][m] = grid[l][m];
            }
        }
        System.out.println("Next Generation");
        return generationPrint(x, y, nextGeneration);
    }
}
