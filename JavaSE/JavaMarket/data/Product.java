
package data;

import java.util.Objects;

public class Product {
    private String id;
    private String productName;
    private double productPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    public Product(){}
    
    public Product(String id, String productName, double productPrice){
        setId(id);
        setProductName(productName);
        setProductPrice(productPrice);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (Double.doubleToLongBits(this.productPrice) != Double.doubleToLongBits(other.productPrice)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "#"+id +" " + productName+ " " + productPrice;
    }

}
