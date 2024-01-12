package com.LabXpert.prod.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reagents")
public class Reagent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reagent_name")
    private String reagentName;

    @Column(name = "description")
    private String description;

    @Column(name = "stock_quantity")
    private int stockQuantity;

    @Temporal(TemporalType.DATE)
    @Column(name = "expiration_date")
    private Date expirationDate;

    @Column(name = "supplier")
    private String supplier;

    public Reagent(Long id, String reagentName, String description, int stockQuantity, Date expirationDate, String supplier) {
        this.id = id;
        this.reagentName = reagentName;
        this.description = description;
        this.stockQuantity = stockQuantity;
        this.expirationDate = expirationDate;
        this.supplier = supplier;
    }

    public Reagent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReagentName() {
        return reagentName;
    }

    public void setReagentName(String reagentName) {
        this.reagentName = reagentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }


}
