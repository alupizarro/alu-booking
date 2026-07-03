package com.hotel.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/habitaciones")
    public String habitaciones() {
        return "habitaciones";
    }

    @GetMapping("/reservar")
    public String reservar() {
        return "reservar";
    }
}