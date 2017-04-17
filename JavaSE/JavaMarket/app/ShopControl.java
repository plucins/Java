package app;

import java.util.InputMismatchException;
import java.util.Scanner;
import util.MarketLogic;
import data.Product;


public class ShopControl {
    
    private static final int EXIT = 1;
    private static final int ADD_PRODUCT = 2;
    private static final int PRINT_PRODUCT = 3;
    private static final int SHOW_CHEAPEST = 4;
    private static final int SHOW_N_CHEAPEST = 5;
    private static final int DISCOUNT_CODE = 6;
    
    
    
    
    MarketLogic logic = new MarketLogic();
    Scanner sc = new Scanner(System.in);
    
    public void printOption(){
        System.out.println("Sklep internetowy - Wybierz opcje");
        System.out.println("1. Wyjście");
        System.out.println("2. Dodaj produkt");
        System.out.println("3. Wyświetl koszyk");
        System.out.println("4. Wyświetl najdroższy i najtańszy");
        System.out.println("5. Wyświetl N najdroższych i najtańszych");
        System.out.println("6. Wprowadz kod rabatowy");
        
    }
    
    public void switchOptions(){
        
        int option = 0;
        
        while(option != EXIT){
            printOption();
            try{
            option = sc.nextInt();
            sc.nextLine();
            }catch(InputMismatchException e){
                System.err.println("Błędna wartość");
                break;
            }
            switch(option){
                case EXIT:
                    System.out.println("Żegnaj");
                    break;
                case ADD_PRODUCT:
                    Product product = new Product();
                    System.out.println("Podaj ID");
                    product.setId(sc.nextLine());
                    System.out.println("Podaj Nazwę produktu");
                    product.setProductName(sc.nextLine());
                    System.out.println("Podaj cenę");
                    double productPrice = 0;
                    try{
                    product.setProductPrice(sc.nextDouble());
                    sc.nextLine();
                    }catch(InputMismatchException e){
                    sc.nextLine();
                    System.err.println("Błędna wartość");
                    }
                    logic.addProduct(product);
                 break;
                case PRINT_PRODUCT:
                    logic.countSum();
                    logic.printProduct();
                    break;
                case SHOW_CHEAPEST:
                    logic.cheapestProduct();
                    break;
                case SHOW_N_CHEAPEST:
                    logic.cheapestNProduct();
                    break;
                case DISCOUNT_CODE:
                    logic.printProduct();
                    logic.discountCode();
                    break;
                default:
                    System.err.println("Błędny wybór");
            }
        }
    }
    
    
}
    
