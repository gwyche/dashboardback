package com.tts.ttsdashboardproject.entities;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table(name="suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="supplier_id")
    private int supplierId;

    @Column(name="supplier_name")
    private String supplierName;

    public Supplier() {
    }

    public Supplier(int supplierId, String supplierName) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
