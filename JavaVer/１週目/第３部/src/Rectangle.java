public class Rectangle {
    public int area() {
        int width = this.right() - this.left();
        int height = this.bottom() - this.top();
        return width * height;
    }

    private int top() {
        return 0;
    }

    private int left() {
        return 0;
    }

    private int bottom() {
        return 0;
    }

    private int right() {
        return 0;
    }
}
