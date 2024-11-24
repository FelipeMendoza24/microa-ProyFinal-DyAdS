package com.example.microa;

import com.example.microa.MicroAFeign;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
public class MicroAController {

    @GetMapping("/cambio")
    public String obtenerCambio(@RequestParam Long id, @RequestParam Boolean estado) {
        log.info("ID recibido: " + id);
        log.info("Estado recibido: " + estado);
        return "Cambio Registrado. Id: " + id + ", Estado: " + estado;

    }
}
