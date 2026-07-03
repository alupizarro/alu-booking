package com.hotel.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class HabitacionController {

    // Lista simulada con tus 4 nuevas categorías y precios exactos
    private final List<Map<String, Object>> habitacionesMock = Arrays.asList(
        Map.of("id", 1, "nombre", "Habitación Single", "precio", 39000.0, "descripcion", "Ideal para una persona, equipada con cama individual y escritorio de trabajo."),
        Map.of("id", 2, "nombre", "Habitación Doble", "precio", 59000.0, "descripcion", "Perfecta para parejas o amigos. Configurable con dos camas o una cama matrimonial."),
        Map.of("id", 3, "nombre", "Habitación Triple", "precio", 79000.0, "descripcion", "Espaciosa y cómoda, cuenta con tres camas individuales o una matrimonial y una single."),
        Map.of("id", 4, "nombre", "Habitación Suite", "precio", 99000.0, "descripcion", "Máximo confort. Incluye cama King Size, sala de estar integrada y jacuzzi privado.")
    );

    @GetMapping("/habitaciones")
    public String listarHabitaciones(Model model) {
        model.addAttribute("habitaciones", habitacionesMock);
        return "habitaciones";
    }

    @PostMapping("/reservar-habitacion")
    public String procesarReserva(
            @RequestParam("habitacionId") Long habitacionId,
            @RequestParam("fechas") String rangoFechas,
            @RequestParam("precioTotal") Double precioTotal,
            Model model) {
        
        model.addAttribute("habitacionId", habitacionId);
        model.addAttribute("fechas", rangoFechas);
        model.addAttribute("precioTotal", precioTotal);
        
        return "reservar"; 
    }
}