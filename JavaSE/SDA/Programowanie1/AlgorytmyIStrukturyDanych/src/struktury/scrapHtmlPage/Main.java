package struktury.scrapHtmlPage;

public class Main {
    public static void main(String[] args) {
        HtmlTabMap h = new HtmlTabMap();

        h.addToMap("p",h.getAllPointedTags("p"));
        h.addToMap("a",h.getAllPointedTags("a"));
        h.addToMap("h1",h.getAllPointedTags("h1"));
        h.addToMap("html",h.getAllPointedTags("html"));
    }
}
