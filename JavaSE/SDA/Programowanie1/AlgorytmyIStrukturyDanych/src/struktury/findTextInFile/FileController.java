package struktury.findTextInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileController {
    private List<String> linesInFile = new ArrayList<>();

    FileController() {
        try {
            putLinesToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void putLinesToFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:/SIR_Update.log"));
        br.lines().forEach(u -> linesInFile.add(u));
    }

    public List<String> wordMatchingList(String w){
        return linesInFile.stream().filter(u -> u.contains(w)).collect(Collectors.toList());
    }

    public void printList(){
        linesInFile.forEach(System.out::println);
    }

    public void printLineWithLineNumber(List<String> strings){
        for(String s : strings){
            System.out.println(linesInFile.indexOf(s) + 1 + " " + s);
        }
    }
    
}
