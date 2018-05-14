package pl.sda.game.views;

import pl.sda.game.map.MapReader;
import pl.sda.game.models.AbstractPaintable;
import pl.sda.game.models.GameHero;
import pl.sda.game.models.movement.MovementHorizontal;
import pl.sda.game.models.movement.MovementVertical;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.io.IOException;

public class MainPanel extends JPanel {
    private Dimension dimension;
    private GameHero hero = new GameHero(400,300);
    private MovementVertical vertical;
    private MovementHorizontal horizontal;

    private List<AbstractPaintable> przeszkody;

    public MainPanel(Dimension dimension) {
        super();

        setSize(dimension);
        setPreferredSize(dimension);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
        this.dimension = dimension;
        MapReader reader = new MapReader("mapy/level1Map.map");
        try {
           przeszkody =  reader.loadMap();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(Color.BLACK);
        graphics2D.fillRect(0,0,dimension.width,dimension.height);

        hero.paint(graphics2D);
        for(AbstractPaintable a: przeszkody){
            a.paint(graphics2D);
        }

    }

    public void moveObjectOnScene(){
        hero.move(vertical,horizontal);
    }

    public void verticalMovement(MovementVertical direction) {
        this.vertical = direction;
    }

    public void horizontalMovement(MovementHorizontal direction) {
        this.horizontal = direction;
    }
}
