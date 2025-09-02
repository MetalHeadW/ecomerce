package com.poo.rock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RockApplication {
/*
* controller
* model
* dto
* repository
 */
    public static void main(String[] args) {
        SpringApplication.run(RockApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    /*
    HTTP <> != HTTPS
    Hyper Text Transfer Protocol
    GET Buscar as informações
    POST Enviar as informações ou empurrar
    PUT Alterar as informações ou mudar
    PATCH Alterar as informações do campo consultas
    DELETE Deletar as informações ou apagar
     */

}
