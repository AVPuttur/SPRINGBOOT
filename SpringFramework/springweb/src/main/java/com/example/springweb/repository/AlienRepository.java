package com.example.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springweb.model.Alien;

@Repository
public interface AlienRepository extends JpaRepository<Alien, Integer>{

}
