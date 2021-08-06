import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class Processing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    public static final int SPEED1 = 1;
    public static final int SPEED2 = 2;
    public static final int SPEED3 = 3;
    public static final int SPEED4 = 4;
    Ball ball1;
    Ball ball2;
    Box box1;
    Box box2;
    private List<Shape> shapes;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(0, getyPosition(1), DIAMETER, SPEED1);
        ball2 = new Ball(0, getyPosition(2), DIAMETER, SPEED2);
        box1 = new Box(0, getyPosition(3), DIAMETER, SPEED3);
        box2 = new Box(0, getyPosition(4), DIAMETER, SPEED4);
        shapes = Arrays.asList(ball1, ball2, box1, box2);
    }

    @Override
    public void draw() {
        // Business Logic
        shapes.forEach(Shape::move);
        shapes.forEach(shape -> shape.draw(this));
    }

    private int getyPosition(int rank) {
        return HEIGHT * rank / 5;
    }
}
