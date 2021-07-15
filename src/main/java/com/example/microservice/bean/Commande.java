package com.example.microservice.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Commande implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Double total=0D;
    private Double totalPaye=0D;

    public Commande(Long id, String reference, Double total, Double totalPaye) {
        this.id = id;
        this.reference = reference;
        this.total = total;
        this.totalPaye = totalPaye;
    }

    public Commande() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalPaye() {
        return totalPaye;
    }

    public void setTotalPaye(Double totalPays) {
        this.totalPaye = totalPays;
    }
}
