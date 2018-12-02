
package com.domain;
public class Purchase {
    private int id;
    private String productName;
    private int qty;
    private int unitPrice;
    private int totalPrice;

    public Purchase() {
    }

    public Purchase(int id, String productName, int qty, int unitPrice, int totalPrice) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", productName=" + productName + ", qty=" + qty + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + '}';
    }
    
    
}
