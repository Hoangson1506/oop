import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TetrisGridTest {
    boolean[][] grid = {
            {true, true, true},
            {true, true, false},
            {true, true, true},
            {false, true, true},
            {true, false, false},
            {false, false, false},
            {false, false, false}
    };
    TetrisGrid tetrisGrid = new TetrisGrid(grid);
    @Test
    void tetrisGridTest_basicCase() {
        boolean[][] expected = {
                {true, true, false},
                {false, true, true},
                {true, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };
        tetrisGrid.clearRows();
        assertArrayEquals(expected, tetrisGrid.getGrid());
    }
}