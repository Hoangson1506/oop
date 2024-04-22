public class CharGrid {
    private char[][] grid;
    public CharGrid(char[][] tableGrid) {
        this.grid  = tableGrid;
    }
    public int charArea(char ch) {
        int minCol = Integer.MAX_VALUE;
        int minRow = Integer.MAX_VALUE;
        int maxCol = 0;
        int maxRow = 0;
        boolean found = false;
        for(int i=0; i< grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == ch) {
                    found = true;
                    minCol = Math.min(j, minCol);
                    minRow = Math.min(i, minRow);
                    maxCol = Math.max(j, maxCol);
                    maxRow = Math.max(i, maxCol);
                }
            }
        }
        int width = maxCol - minCol + 1;
        int length = maxRow - minRow + 1;
        if(!found) return 0;
        return width * length;
    }
    public int countPlus() {
        int count = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length - 1; j++) {
                if (grid[i][j] != ' ') {
                    int size = checkPlus(i, j);
                    if (size > 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private int checkPlus(int i, int j) {
        char c = grid[i][j];
        int size = 1;
        while (true) {
            if (i - size < 0 || i + size >= grid.length || j - size < 0 || j + size >= grid[i].length) {
                break;
            }
            if (grid[i - size][j] == c && grid[i + size][j] == c && grid[i][j - size] == c && grid[i][j + size] == c) {
                size++;
            } else {
                if(grid[i - size][j] != c && grid[i + size][j] != c && grid[i][j - size] != c && grid[i][j + size] != c) {
                    break;
                }
                else {
                    return 1;
                }
            }
        }
        return size;
    }
}
