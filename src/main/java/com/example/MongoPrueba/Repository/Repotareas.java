package com.example.MongoPrueba.Repository;

import com.example.MongoPrueba.Entity.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repotareas extends MongoRepository<Tarea, String> {
}
