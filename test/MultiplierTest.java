import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MultiplierTest {

    @Test
    void multiply() {
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.multiply(7, 9), 63);
    }

    @Test
    void testMultiply() {
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.multiply(2, 3, 4), 24);
    }
}