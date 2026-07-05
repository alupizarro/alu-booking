package com.hotel.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    // <-- Cambiamos esta ruta para que no choque con HabitacionController
    @GetMapping("/nuestras-habitaciones") 
    public String habitaciones() {
        return "habitaciones";
    }

    @GetMapping("/reservar")
    public String reservar() {
        return "reservar";
    }

    @GetMapping("/contacto")
public String contacto() {
    return "contacto"; // Cambiado de "index" a "contacto"
}
}