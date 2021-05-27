import javax.swing.*;

public class SelectionTool {
    Figure selected;
    SelectionMode mode;
    public void mouseDown() {
        selected = findFigre();
        if(selected != null)
            mode = new SingleSelectionModel(selected);
        else
            mode = new MultipleSelection();
    }
    public void mouseMove() {
        mode.mouseMove();
    }
    public void mouseUp() {
        mode.mousuUp();
    }
}
