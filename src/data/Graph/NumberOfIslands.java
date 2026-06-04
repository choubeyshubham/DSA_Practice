package data.Graph;

public class NumberOfIslands {
    /*
    Number of Islands: Given a 2D grid of '1's (land) and '0's (water), count the number
of islands.
     */

    void main() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(island(grid));
    }
    public static int island(char[][] grid) {
        if (grid == null || grid.length == 0 )  return 0;
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs2(grid, i, j);
                }
            }
        }
        return count;
    }
    public static void dfs2(char[][] grid, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == '0')
            return;
        grid[i][j]='0';
        dfs2(grid,i+1,j);
        dfs2(grid,i-1,j);
        dfs2(grid,i,j+1);
        dfs2(grid,i,j-1);
    }


}
