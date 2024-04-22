import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharGridTest {
    CharGrid charGrid;
    @Test
    void charAreaTest_basicCase() {
        char[][] tableGrid = {
            {'c', 'a', 'x'},
            {'b', ' ', 'b'},
            {' ', ' ', 'a'}
        };
        CharGrid charGrid = new CharGrid(tableGrid);
        assertEquals(6, charGrid.charArea('a'));
    }
    @Test
    void charAreaTest_zeroCase() {
        char[][] tableGrid = {
                {'c', 'a', 'x'},
                {'b', ' ', 'b'},
                {' ', ' ', 'a'}
        };
        CharGrid charGrid = new CharGrid(tableGrid);
        assertEquals(0, charGrid.charArea('d'));
    }
    @Test
    void charAreaTest_oneCase() {
        char[][] tableGrid = {
                {'c', 'a', 'x'},
                {'b', ' ', 'b'},
                {' ', ' ', 'a'}
        };
        CharGrid charGrid = new CharGrid(tableGrid);
        assertEquals(1, charGrid.charArea('c'));
    }
    @Test
    void countPlusTest_basicCase() {
        char[][] table = {
                {' ', ' ', 'p', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'p', ' ', ' ', ' ', ' ', 'x', ' '},
                {'p', 'p', 'p', 'p', 'p', ' ', 'x', 'x', 'x'},
                {' ', ' ', 'p', ' ', ' ', 'y', ' ', 'x', ' '},
                {' ', ' ', 'p', ' ', 'y', 'y', 'y', ' ', ' '},
                {'z', 'z', 'z', 'z', 'z', 'y', 'z', 'z', 'z'},
                {' ', ' ', 'x', 'x', ' ', 'y', ' ', ' ', ' '}
        };
        charGrid = new CharGrid(table);
        assertEquals(2, charGrid.countPlus());
    }
}