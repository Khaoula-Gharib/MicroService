package com.example.microservice.service.facade;

import com.example.microservice.bean.Commande;

import java.util.List;

public interface CommandeService {
    Commande findByRefCommande(String reference);
    int save(Commande commande);
    int update(Commande commande);
    List<Commande> findAll();
}
