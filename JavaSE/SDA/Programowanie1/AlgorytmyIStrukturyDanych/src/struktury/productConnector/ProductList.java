package struktury.productConnector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products = new ArrayList<>();

    private String getProductFromFile() {
        String calosc = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Profile\\plucsl1\\Dropbox\\GitHub\\Java\\JavaSE\\SDA\\Programowanie1\\AlgorytmyIStrukturyDanych\\src\\struktury\\productConnector\\1.txt"));

            String a = "";
            while ((a = br.readLine()) != null) {
                if (!a.isEmpty()) {
                    calosc += a;
                    calosc += "&";
                } else {
                    calosc += "--";
                }

            }
            System.out.println(calosc);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return calosc;
    }

    public void getSingleProduct() {
        String[] singleProdTable = getProductFromFile().split("--");
        String id;
        String name;
        String kolor;
        String type;
        String price;
        String stock;
        for (String s : singleProdTable) {
            String[] tab = s.split("&");
            id = tab[0];
            if (tab[1].contains("kolor")) {
                String[] tab1 = tab[1].split("kolor");
                name = tab1[0].trim();
                kolor = tab1[1].substring(0, tab1[1].length() - 1).trim();
                type = tab[2].trim();
                price = tab[3].trim();
                stock = tab[4].trim();
            } else {
                name = tab[1].trim();
                kolor = tab[2].trim();
                type = tab[3].trim();
                price = tab[4].trim();
                stock = tab[5].trim();
            }
            products.add(new Product(id, name, kolor, type, price, stock));


        }
    }


    public void printList() {
        products.stream().forEach(System.out::println);
    }
}
