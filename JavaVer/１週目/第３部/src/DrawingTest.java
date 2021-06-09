import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawingTest {
    @Test
    public void testOval() {
        Drawing d = new Drawing();
        d.addFigure(new OvalFigure(0, 10, 50, 100));
        RecordingMedium brush = new RecordingMedium();
        d.display(brush);
        assertEquals("oval 0 10 50 100\n", brush.log());
    }
}

class Drawing {
    public void addFigure(RectangleFigure rectangleFigure) {
    }

    public void display(RecordingMedium brush) {
    }

    public void addFigure(OvalFigure ovalFigure) {
    }
}

class RectangleFigure {
}

class OvalFigure {
    int x, y, h, w;

    public OvalFigure(int x, int y, int h, int w) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }
}

class RecordingMedium {

    public String log() {
        return "log";
    }
}