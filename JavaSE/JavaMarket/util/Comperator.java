package util;

import data.Product;
import java.util.*;


public class Comperator implements Comparator<Product> {
    
    @Override
    public int compare(Product p1, Product p2){
    if(Double.compare(p1.getProductPrice(), p2.getProductPrice()) == 0){
        return p1.getProductName().compareTo(p2.getProductName());
    }else {
        return Double.compare(p1.getProductPrice(), p2.getProductPrice());
    }
    
    }
}
