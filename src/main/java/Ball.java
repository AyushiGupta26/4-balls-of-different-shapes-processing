import processing.core.PApplet;

public class Ball implements Shape{
    int xPosition, yPosition, diameter, speed;

    public Ball(int xPosition, int yPosition, int diameter, int speed) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void move(){
        xPosition += speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(xPosition, yPosition, diameter, diameter);
    }

}
