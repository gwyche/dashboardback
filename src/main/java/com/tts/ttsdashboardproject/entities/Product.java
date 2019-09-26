package com.tts.ttsdashboardproject.entities;


import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="productname")
    private String product_name;


    @Column(name="category")
    private String category;

    @Column(name="fullprice")
    private double fullPrice;

    @Column(name="saleprice")
    private double salePrice;

    @Column(name="availability")
    private boolean availability;


    @Column(name="supplier")
    private String supplier;

    public Product() {
    }

    public Product(int id, String product_name, String category, double fullPrice, double salePrice, boolean availability, String supplier) {
        this.id = id;
        this.product_name = product_name;
        this.category = category;
        this.fullPrice = fullPrice;
        this.salePrice = salePrice;
        this.availability = availability;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
