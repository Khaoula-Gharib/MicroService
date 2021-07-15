package com.example.microservice.service.impl;

import com.example.microservice.bean.Commande;
import com.example.microservice.dao.CommandeDao;
import com.example.microservice.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {
    @Autowired
    private CommandeDao commandeDao;

    public Commande findByReference(String reference) {
        return commandeDao.findByReference(reference);
    }

    @Override
    public List<Commande> findAll() {
        return commandeDao.findAll();
    }

    @Override
    public Commande findByRefCommande(String reference) {
        return commandeDao.findByReference(reference);
    }

    @Override
    public int save(Commande commande) {
        if(findByReference(commande.getReference())!= null){
            return -1;
        }else if(commande.getTotalPaye()>commande.getTotal()){
            return -2;
        }else {
            commandeDao.save(commande);
            return 1;
        }
    }

    @Override
    public int update(Commande commande) {
        commandeDao.save(commande);
        return 1;
    }
}
