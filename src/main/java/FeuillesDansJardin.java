public class FeuillesDansJardin {

    /*  Sujet :Question
 */


    public static int remainingLeaves(int width, int height, int[][] leaves, String winds) {
        int[][] grid = new int[height][width];
        for (int[] leaf : leaves) {
            int row = leaf[0];
            int col = leaf[1];
            grid[row][col]++;
        }

        for (char wind : winds.toCharArray()) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    int newRow = i, newCol = j;
                    if (wind == 'u') newRow--;
                    else if (wind == 'd') newRow++;
                    else if (wind == 'l') newCol--;
                    else if (wind == 'r') newCol++;

                    if (newRow >= 0 && newRow < height && newCol >= 0 && newCol < width) {
                        grid[newRow][newCol] += grid[i][j];
                    }
                }
            }
        }

        int totalLeaves = 0;
        for (int[] row : grid) {
            for (int count : row) {
                totalLeaves += count;
            }
        }
        return totalLeaves;
    }

}
