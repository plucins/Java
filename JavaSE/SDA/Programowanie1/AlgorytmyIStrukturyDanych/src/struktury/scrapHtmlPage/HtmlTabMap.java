package struktury.scrapHtmlPage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlTabMap {
    private Map<String, List<String>> htmlMap = new HashMap<>();


    public void addToMap(String tagName, List<String> list){
        htmlMap.put(tagName, list);
    }


    private Document getSourceCode(){
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL("https://www.mozilla.org/en-US/firefox/");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            while((line = br.readLine()) != null){
                sb.append(line);
                sb.append(System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return Jsoup.parse(sb.toString());
    }

    public List<String> getAllPointedTags(String tag){
        List<String> array = new ArrayList<>();
        Document doc = getSourceCode();
            for(Element e : doc.select(tag)) {
                if (e.hasText()) {
                    array.add(e.text());
                }
            }
        return array;
    }
}
