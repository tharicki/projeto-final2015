package br.com.tharicki.projetofinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "Funcionou até aqui, ma nem se anime, no resto vai da pau... Ctz!";
    }

}
