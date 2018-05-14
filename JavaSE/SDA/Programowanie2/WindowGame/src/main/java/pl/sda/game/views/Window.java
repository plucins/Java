package pl.sda.game.views;


import pl.sda.game.models.movement.MovementHorizontal;
import pl.sda.game.models.movement.MovementVertical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Window extends JFrame {
    //constans
    private static final int WINDOWS_WIDTH = 800;
    private static final int WINDOWS_HEIGHT = 600;
    private static final int FPS = 30;

    //fields
    private MainPanel mainPanel;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public Window() throws HeadlessException {
        super();

        Dimension dimension = new Dimension(WINDOWS_WIDTH, WINDOWS_HEIGHT);
        mainPanel = new MainPanel(dimension);

        setSize(dimension);
        setPreferredSize(dimension);
        setMinimumSize(dimension);
        setMaximumSize(dimension);

        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        KeyAdapter keyAdapter = new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Kliknieto " + e.getKeyCode());
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    mainPanel.verticalMovement(MovementVertical.UP);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    mainPanel.verticalMovement(MovementVertical.DOWN);
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    mainPanel.horizontalMovement(MovementHorizontal.LEFT);
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    mainPanel.horizontalMovement(MovementHorizontal.RIGHT);
                }
                super.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Puszczono " + e.getKeyCode());
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    mainPanel.verticalMovement(MovementVertical.NONE);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    mainPanel.verticalMovement(MovementVertical.NONE);
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    mainPanel.horizontalMovement(MovementHorizontal.NONE);
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    mainPanel.horizontalMovement(MovementHorizontal.NONE);
                }
                super.keyReleased(e);
            }
        };
        addKeyListener(keyAdapter);

        executorService.submit(new Runnable() {
            public void run() {

                long timeStart, timeEnd;
                long howManyTimeForOneFts = (1000 / FPS);
                while (true) {
                    try {
                        timeStart = System.currentTimeMillis();
                        repaint();
                        timeEnd = System.currentTimeMillis();

                        long howLongItTake = timeEnd - timeStart;
                        if (howLongItTake < howManyTimeForOneFts) {
                            Thread.sleep(howManyTimeForOneFts - howLongItTake);
                        }
                        mainPanel.moveObjectOnScene();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }

                }
            }
        });

    }
}
