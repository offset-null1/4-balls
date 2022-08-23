import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x1, x2, x3, x4 = 0;
    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
//        ellipse(WIDTH/2, HEIGHT/2, 100, 100);
    }

    @Override
    public void draw() {
//        paintWhite();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x1, HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(x2, 2 * HEIGHT/5, DIAMETER, DIAMETER );
        ellipse(x3, 3 * HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(x4, 4 * HEIGHT/5, DIAMETER, DIAMETER);

        x1 += 1;
        x2 += 2;
        x3 += 3;
        x4 += 4;
    }

    private void paintWhite() {
        background(255);
    }
}
