
package com.domain;
public class Summary {
    private int id;
    private String productName;
    private int salesQty;
    private int availableQty;
    private int totalQty;
    Purchase purchase;

    public Summary() {
    }

    public Summary(int id, String productName, int salesQty, int availableQty, int totalQty, Purchase purchase) {
        this.id = id;
        this.productName = productName;
        this.salesQty = salesQty;
        this.availableQty = availableQty;
        this.totalQty = totalQty;
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

    public int getSalesQty() {
        return salesQty;
    }

    public void setSalesQty(int salesQty) {
        this.salesQty = salesQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "Summary{" + "id=" + id + ", productName=" + productName + ", salesQty=" + salesQty + ", availableQty=" + availableQty + ", totalQty=" + totalQty + ", purchase=" + purchase + '}';
    }
    
    

}
