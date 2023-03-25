package com.example.MongoPrueba.Service;

import com.example.MongoPrueba.Entity.Tarea;
import com.example.MongoPrueba.Repository.Repotareas;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Servicetareas {
    private final Repotareas repositorioTareas;

    public void save(Tarea tarea){
        repositorioTareas.save(tarea);
    }
    public List<Tarea> findAll(){
        return repositorioTareas.findAll();
    }
    public Optional<Tarea> findById(String id){
        return repositorioTareas.findById(id);
    }
    public void delete(String id){
        repositorioTareas.deleteById(id);
    }

}
