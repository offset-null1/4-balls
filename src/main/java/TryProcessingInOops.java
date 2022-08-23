import processing.core.PApplet;

public class TryProcessingInOops extends PApplet{


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    Circle c1, c2, c3, c4;


    public static void main(String[] args) {
        PApplet.main("TryProcessingInOops",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        c1 = new Circle(1, 0.2f);
        c2 = new Circle(2, 0.4f);
        c3 = new Circle(3, 0.6f);
        c4 = new Circle(4, 0.8f);
    }

    @Override
    public void draw() {
        drawCircle(c1);
        drawCircle(c2);
        drawCircle(c3);
        drawCircle(c4);

    }

    private void drawCircle(Circle c){
        ellipse(c.xState, HEIGHT * c.height, DIAMETER, DIAMETER);
        c.move();
    }
}
