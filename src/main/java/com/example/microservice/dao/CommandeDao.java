package com.example.microservice.dao;

import com.example.microservice.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeDao extends JpaRepository <Commande,Long>{
    Commande findByReference(String reference);
}
