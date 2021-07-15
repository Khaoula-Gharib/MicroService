package com.example.microservice.ws.provided.converter;

import com.example.microservice.bean.Commande;
import com.example.microservice.ws.provided.vo.CommandeVo;
import org.springframework.stereotype.Component;

//convertir un bean a un VO

@Component
public class CommandeConverter {
    public CommandeVo toVo(Commande bean) { //convertir un bean à un VO
        CommandeVo vo = new CommandeVo();
        if(bean.getReference() != null)
            vo .setReference(bean.getReference());
        if(bean.getTotal() != null)
            vo.setTotal(bean.getTotal().toString());
        if(bean.getTotalPaye() != null)
            vo.setTotalPaye(bean.getTotalPaye().toString());
        if(bean.getId() != null) {
            vo.setId(bean.getId());
        }
        return vo;
    }

    public Commande toBean(CommandeVo vo) { //convertir un VO à un bean
        Commande bean = new Commande();
        if(vo.getReference() != null)
            bean.setReference(vo.getReference());
        if(vo.getTotal() != null)
            bean.setTotal(Double.parseDouble(vo.getTotal()));
        if(vo.getTotalPaye() != null)
            bean.setTotalPaye(Double.parseDouble(vo.getTotalPaye()));
        if(vo.getId() != null) {
            bean.setId(vo.getId());
        }
        return bean;
    }


}
