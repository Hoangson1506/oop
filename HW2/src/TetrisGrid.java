public class TetrisGrid {
    boolean[][] grid;
    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }
    public void clearRows() {
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            count = 0;
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == true) {
                    count++;
                }
            }
            if(count == grid[i].length) {
                for(int k=i; k<grid.length-1; k++) {
                    for(int l=0; l<grid[k].length; l++) {
                        grid[k][l] = grid[k+1][l];
                    }
                }
            }
        }
    }
    public boolean[][] getGrid() {
        return grid;
    }
}
