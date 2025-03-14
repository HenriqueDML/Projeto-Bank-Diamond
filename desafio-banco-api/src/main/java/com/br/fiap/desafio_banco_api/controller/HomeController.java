package com.br.fiap.desafio_banco_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Projeto Bank - Larissa Muniz & Henrique Garcia";
    }
}
