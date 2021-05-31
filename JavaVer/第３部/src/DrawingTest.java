import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawingTest {
    @Test
    public void testRectangle() {
        Drawing d = new Drawing();
        d.addFigure(new RectangleFigure());
        RecordingMedium brush = new RecordingMedium();
        d.display(brush);
        assertEquals("rectangle 0 10 50 100\n", brush.log());
    }
}

class Drawing {
    public void addFigure(RectangleFigure rectangleFigure) {
    }

    public void display(RecordingMedium brush) {
    }
}

class RectangleFigure {
}

class RecordingMedium {

    public String log() {
        return "log";
    }
}