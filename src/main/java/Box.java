import processing.core.PApplet;

public class Box implements Shape{
    int xPosition, yPosition, side, speed;

    public Box(int xPosition, int yPosition, int side, int speed) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.side = side;
        this.speed = speed;
    }

    public void move(){
        xPosition += speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.rect(xPosition, yPosition, side, side);
    }

}
