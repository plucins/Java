package ConfigSingleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileController {

    private List<String> list = new ArrayList<>();

    private void readFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("config.cfg"))) {
            String line;

            while (true) {
                line = br.readLine();
                if(line == null) break;
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getConfigFromFile(){
        readFromFile();
        return list.stream().collect(Collectors.toList());
    }
}
