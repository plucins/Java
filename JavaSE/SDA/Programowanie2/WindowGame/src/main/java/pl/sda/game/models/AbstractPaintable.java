package pl.sda.game.models;

import pl.sda.game.models.movement.MovementHorizontal;
import pl.sda.game.models.movement.MovementVertical;

import java.awt.*;

public abstract class AbstractPaintable {
    protected int positionX;
    protected int positionY;
    private int speed = 2;

    public AbstractPaintable(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public abstract void paint(Graphics2D brush);

    public void move(MovementVertical vertical, MovementHorizontal horizontal){
        if(vertical == MovementVertical.DOWN){
            positionY += speed;
        }else if(vertical == MovementVertical.UP){
            positionY -= speed;
        }

        if(horizontal == MovementHorizontal.LEFT){
            positionX -= speed;
        }else if(horizontal == MovementHorizontal.RIGHT){
            positionX += speed;
        }
    }
}
