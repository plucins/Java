package util;

import data.Product;
import java.util.*;

public class MarketLogic {

    Product product = new Product();
    Scanner sc = new Scanner(System.in);

    private ArrayList<Product> products;
    private int productNumber;
    private int discountCounter;

    public MarketLogic() {
        products = new ArrayList<>();
        productNumber = 0;
        discountCounter = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
        productNumber++;
    }

    public void printProduct() {
        sort();
        for (int i = 0; i < productNumber; i++) {
            System.out.println(products.get(i));
        }
        if (productNumber == 0) {
            System.out.println("Koszyk jest pusty");
        }
    }

    public void countSum() {
        sort();
        double sum = 0;
        for (int i = 0; i < productNumber; i++) {
            sum = sum + products.get(i).getProductPrice();
        }
        if (sum > 200 && !(products.get(0).getProductName().equals("kubek firmowy"))) {
            product.setId("0");
            product.setProductName("kubek firmowy");
            product.setProductPrice(0);
            addProduct(product);
        }

        if (productNumber >= 3) {
            if (sum > 300) {
                sum = sum - products.get(1).getProductPrice();
                System.out.println("Produkt: " + products.get(1).getProductName() + " otrzymujesz za 0zł");
            } else {
                sum = sum - products.get(0).getProductPrice();
                System.out.println("Produkt: " + products.get(0).getProductName() + " otrzymujesz za 0zł");
            }
        }

        if (sum < 300) {
            System.out.println("Cena łączna: " + sum);
        } else {
            System.out.println("Cena łączna po rabacie: " + sum * 0.95);
        }
    }

    public void sort() {
        Collections.sort(products, new Comperator());
    }

    public void cheapestProduct() {
        sort();
        if (productNumber < 2) {
            System.err.println("Brak przynajmniej 2 produktów w koszyku");
        } else {
            System.out.println("Najtańszy: " + products.get(0));
            System.out.println("Najdroższy: " + products.get(productNumber - 1));
        }
    }

    public void cheapestNProduct() {
        sort();
        System.out.println("Ile produktów chcesz wyszukać?");
        int n = sc.nextInt();
        sc.nextLine();
        int ilosc = n;
        if (productNumber < 2 * n) {
            System.err.println("Brak przynajmniej " + 2 * n + " produktów w koszyku");
        } else {
            System.out.println("Najdroższe " + n);
            for (int i = productNumber - 1; ilosc > 0; ilosc--) {
                System.out.println(products.get(i));
            }
            System.out.println("Najtańsze " + n);
            for (int i = 0; i <= n - 1; i++) {
                System.out.println(products.get(i));
            }
        }
    }

    public int discountCode() {

        if (productNumber != 0) {
            System.out.println("Podaj ID produktu");
            String code;
            code = sc.nextLine();

            discountCounter++;
            if (discountCounter <= 1) {
                for (Product p : products) {
                    if (p.getId().equals(code)) {
                        p.setId(products.get(products.indexOf(p)).getId());
                        p.setProductName(products.get(products.indexOf(p)).getProductName());
                        p.setProductPrice(products.get(products.indexOf(p)).getProductPrice() * 0.70);
                        products.set(products.indexOf(p), p);

                    }
                }

            } else {
                System.err.println("Wykorzystano już kod rabatowy");
            }

        }
        return -1;
    }

}
