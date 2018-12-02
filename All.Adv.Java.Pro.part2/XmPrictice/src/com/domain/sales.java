
package com.domain;
public class sales {
    private int id;
    private String productName;
    private int qty;
    private int unitPrice;
    private int totalPrice;
    Purchase purchase;

    public sales() {
    }

    public sales(int id, String productName, int qty, int unitPrice, int totalPrice, Purchase purchase) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purchase = purchase;
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

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "sales{" + "id=" + id + ", productName=" + productName + ", qty=" + qty + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + ", purchase=" + purchase + '}';
    }
    
    

}