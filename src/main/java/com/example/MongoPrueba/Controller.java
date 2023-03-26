package com.example.MongoPrueba;

import com.example.MongoPrueba.Entity.Tarea;
import com.example.MongoPrueba.Service.Servicetareas;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class Controller {
    private final Servicetareas servicetareas;

    @PostMapping("/tarea")
    public void save(@RequestBody Tarea tarea){
        servicetareas.save(tarea);
    }
    @GetMapping("/tarea")
    public List<Tarea> findAll(){
        return servicetareas.findAll();
    }
    @GetMapping("/tarea/{id}")
    public Tarea findById(@PathVariable String id){
        return servicetareas.findById(id).get();
    }
    @DeleteMapping("/tarea/{id}")
    public void deleteById(@PathVariable String id){
        servicetareas.delete(id);
    }
    @PutMapping("/tarea")
    public void update(@RequestBody Tarea tarea){
        servicetareas.save(tarea);
    }
}
