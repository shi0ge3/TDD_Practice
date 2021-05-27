public class SelectionTool {
    Figure selected;
    public void mouseDown() {
        selected = findFigre();
        if(selected != null)
            select(selected);
    }
    public void mouseMove() {
        if (selected != null)
            move(selected);
        else
            moveSelectionRectangle();
    }
    public void mouseUp() {
        if (selected == null)
            selectAll();
    }
}
