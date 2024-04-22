import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCodeTest {
    StringCode stringCode = new StringCode();
    @Test
     void stringIntersectTest_basic() {
        assertEquals(true, stringCode.stringIntersect("abcdbadc", "bcdbacda", 4));
    }
    @Test
    void blowupTest_numberAtMiddle() {
        assertEquals("attttxzzz", stringCode.blowup("a3tx2z"));
    }
    @Test
    void maxRun_onlyOneChar() {
        assertEquals(1, stringCode.maxRun("x"));
    }
    @Test
    void maxRun_basicCase() {
        assertEquals(3, stringCode.maxRun("xxxyyzzz"));
    }
}