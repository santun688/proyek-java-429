import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class mainTest {
    @Test
    void testScenario1() {
        assertEquals(1, MinFinder.findMin(1, 2, 3));
    }

    @Test
    void testScenario2() {
        assertEquals(-3, MinFinder.findMin(-1, -2, -3));
    }

    @Test
    void testScenario3() {
        assertEquals(0, MinFinder.findMin(0, 0, 1));
    }
}