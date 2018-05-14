package pl.sda.game.models;

import java.awt.*;

public class GameHero extends AbstractPaintable {

    public GameHero(int positionX, int positionY) {
        super(positionX, positionY);
    }

    public void paint(Graphics2D brush) {
        brush.setColor(Color.RED);
        brush.fillRect(positionX,positionY,30,30);
    }
}
