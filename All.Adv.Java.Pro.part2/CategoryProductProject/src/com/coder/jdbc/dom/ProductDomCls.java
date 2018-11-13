
package com.coder.jdbc.dom;

import java.util.Date;

public class ProductDomCls {
    private int id;
    private String name;
    private int qty;
    private double unitPrice;
    private double totalPrice;
    private Date purchesDate;
    private CatagoryDomCls catagoryDomCls;

    public ProductDomCls() {
    }

    public ProductDomCls(int id, String name, int qty, double unitPrice, double totalPrice, Date purchesDate, CatagoryDomCls catagoryDomCls) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purchesDate = purchesDate;
        this.catagoryDomCls = catagoryDomCls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getPurchesDate() {
        return purchesDate;
    }

    public void setPurchesDate(Date purchesDate) {
        this.purchesDate = purchesDate;
    }

    public CatagoryDomCls getCatagoryDomCls() {
        return catagoryDomCls;
    }

    public void setCatagoryDomCls(CatagoryDomCls catagoryDomCls) {
        this.catagoryDomCls = catagoryDomCls;
    }

    public void getTotalPrice(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
