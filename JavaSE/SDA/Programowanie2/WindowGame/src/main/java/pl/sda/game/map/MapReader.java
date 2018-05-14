package pl.sda.game.map;

import pl.sda.game.models.AbstractPaintable;
import pl.sda.game.models.ObstacleGround;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MapReader {
    private String mapName;
    private BufferedReader bufferedReader;

    public MapReader(String mapName) {
        this.mapName = mapName;
    }

    private void openFile() {
        try {
            bufferedReader = new BufferedReader(new FileReader(mapName));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<AbstractPaintable> loadMap() throws IOException {
        openFile();
        String linia;
        int counter = 0;
        List<AbstractPaintable> mapsElements = new ArrayList<>();
        while ((linia = bufferedReader.readLine()) != null) {
            for (int i = 0; i < linia.length(); i++) {
                if (linia.charAt(i) == '1') {
                    mapsElements.add(new ObstacleGround(530, i, counter));
                }
            }
            counter++;
        }
        return mapsElements;
    }


}
