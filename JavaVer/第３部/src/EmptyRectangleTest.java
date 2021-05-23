import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmptyRectangleTest {
    private Rectangle empty;
    @BeforeEach
    public void setUp() {
        this.empty = new Rectangle(0,0,0,0);
    }
    @Test
    public void testEmpty() {
        assertTrue(this.empty.isEmpty());
    }
    @Test
    public void testWidth() {
        assertEquals(0.0, this.empty.getWidth(), 0.0);
    }
}
