package com.example.microservice.ws.provided.facade;

import com.example.microservice.bean.Commande;
import com.example.microservice.service.facade.CommandeService;
import com.example.microservice.ws.provided.converter.CommandeConverter;
import com.example.microservice.ws.provided.vo.CommandeVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("ecom/commande-api")
@Api("Gestion de Commande")
public class CommandeProvidedRest {

    @Autowired
    private CommandeService commandeService;
    @Autowired
    private CommandeConverter commandeConverter;
    @ApiOperation("find command by ref")
    @GetMapping("/reference/{reference}")
    public CommandeVo findByRefCommande(@PathVariable String reference) {
        Commande commande =  commandeService.findByRefCommande(reference);
        return commandeConverter.toVo(commande);
    }

    @ApiOperation("save command if ref is not already saved")
    @PostMapping("/")
    public int save(@RequestBody CommandeVo commandeVo) {
        Commande commande = commandeConverter.toBean(commandeVo);
        return commandeService.save(commande);
    }


    @ApiOperation("update command")
    @PutMapping("/")
    public int update(@RequestBody CommandeVo commandeVo) {
        Commande commande = commandeConverter.toBean(commandeVo);
        return commandeService.update(commande);
    }

    @ApiOperation("find list of command ")
    @GetMapping("/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }
}
