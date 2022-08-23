
public class Circle {
    int xState;
    int speed;
    float height;

    public Circle(int speed, float height) {
        this.xState = 0;
        this.speed = speed;
        this.height = height;
    }

    public void move() {
        this.xState += this.speed;
    }
}
