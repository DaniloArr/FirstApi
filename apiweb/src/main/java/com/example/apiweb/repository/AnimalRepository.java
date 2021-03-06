package com.example.apiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiweb.dominio.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

}
