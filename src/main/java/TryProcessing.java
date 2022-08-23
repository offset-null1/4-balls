import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x1, x2, x3, x4 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {

        drawCircle();

    }

    private void drawCircle() {
        moveFirstBall();
        moveSecondBall();
        moveThirdBall();
        moveFourthBall();
    }

    private void moveFourthBall() {
        ellipse(x4, 4 * HEIGHT / 5, DIAMETER, DIAMETER);
        x4 += 4;
    }

    private void moveThirdBall() {
        ellipse(x3, 3 * HEIGHT / 5, DIAMETER, DIAMETER);
        x3 += 3;
    }

    private void moveSecondBall() {
        ellipse(x2, 2 * HEIGHT / 5, DIAMETER, DIAMETER);
        x2 += 2;

    }

    private void moveFirstBall() {
        ellipse(x1, HEIGHT / 5, DIAMETER, DIAMETER);
        x1++;
    }


}
