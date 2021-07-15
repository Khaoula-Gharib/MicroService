package com.example.microservice.ws.provided.vo;

import com.example.microservice.bean.Commande;

public class CommandeVo  {
    private Long id;
    private String reference;
    private String total;
    private String totalPaye;

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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalPaye() {
        return totalPaye;
    }

    public void setTotalPaye(String totalPaye) {
        this.totalPaye = totalPaye;
    }
}
