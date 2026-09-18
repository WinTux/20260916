package com.educomser.ejemplo02.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PruebaController {
    @GetMapping("/saludo")
    public String unEndpoint(){
        return "Hola a todos";
    }
}
