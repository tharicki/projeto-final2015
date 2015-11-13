package br.com.tharicki.projetofinal.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@RestController
public class Contro {

    @RequestMapping("/teste")
    public String teste(){
        return "TESTE OK";
    }

}
