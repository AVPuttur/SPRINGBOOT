package com.example.springweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springweb.model.Alien;
import com.example.springweb.service.AlienService;

@RestController
public class AlienController {

	@Autowired
    private AlienService service;
	
	// RESTful API methods for Retrieval operations
    @GetMapping("/aliens")
    public List<Alien> list() {
      return service.listAll();
	}
    // RESTful API method for Create operation
    @PostMapping("/aliens")
    public void add(@RequestBody Alien alien) {
        service.save(alien);
    }
    // RESTful API method for Update operation
     
    // RESTful API method for Delete operation
}
