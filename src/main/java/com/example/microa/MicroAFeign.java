package com.example.microa;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "INMOBILIARIOSYSTEM")
public interface MicroAFeign {

    @PutMapping(path = "/actualizarPropiedadEstado/{id}")
    String actualizarEstadoPropiedad(@PathVariable Long id, @RequestParam Boolean estado);


}
