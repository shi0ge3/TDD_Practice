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

    private Figure findFigre() {
        return new Figure();
    }

    public void mouseMove() {
        mode.mouseMove();
    }
    public void mouseUp() {
        mode.mousuUp();
    }
}

class Figure {
}

class SelectionMode {
    void mousuUp() {
    }

    void mouseMove() {
    }
}

class SingleSelectionModel extends SelectionMode {
    SingleSelectionModel(Figure selected) {
    }
}

class MultipleSelection extends SelectionMode {
    MultipleSelection(){
    }
}
