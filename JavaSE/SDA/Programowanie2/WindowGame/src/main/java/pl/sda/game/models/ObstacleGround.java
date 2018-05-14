package pl.sda.game.models;

import java.awt.*;

public class ObstacleGround extends AbstractPaintable{
    private final static int SIZE_X = 30;
    private final static int SIZE_Y = 30;

    public ObstacleGround(int positionYOffset, int positionX, int positionY) {
        super(positionX * SIZE_X, positionYOffset - positionY * SIZE_Y);
    }

    public void paint(Graphics2D brush) {
        brush.setColor(Color.CYAN);
        brush.fillRect(positionX,positionY,SIZE_X,SIZE_Y);
    }
}
