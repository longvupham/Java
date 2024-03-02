package ly

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getP() {
        return 2 * width + 2 * height;
    }

    public float getA() {
        return width * height;
    }
    public void display(){
        System.out.println("hcn"+width+","+height);
    }
}
