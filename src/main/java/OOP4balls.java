import processing.core.PApplet;

public class OOP4balls extends PApplet {
    private static final int width = 640;
    private static final int height = 480;
    private static final int diameter=10;
    Ball[] movingBalls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("OOP4balls", args);
    }

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        double intSpeed = 1;

        for (int ballno = 1; ballno < 5; ballno++) {
            movingBalls[ballno-1] = new Ball(diameter,0, ballno * 96, intSpeed * ballno);
        }
    }

    @Override
    public void draw() {
        for (Ball b : movingBalls) {
            ellipse(b.posX,b.posY,b.diameter,b.diameter);
            b.posX+=b.speedX;
        }
    }
}
