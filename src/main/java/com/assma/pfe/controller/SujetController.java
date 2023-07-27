package com.assma.pfe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assma.pfe.entities.Sujet;
import com.assma.pfe.services.SujetService;

@RestController
public class SujetController {
	@Autowired
	private SujetService  sujetService;
    public SujetController(SujetService sujetService) {
		this.sujetService = sujetService;
	}

	@GetMapping("/sujet/all")
    public ResponseEntity<List<Sujet>> getAllSujets () {
        List<Sujet> sujet = sujetService.findAllSujets();
        return new ResponseEntity<>(sujet, HttpStatus.OK);
    }

    @GetMapping("/sujet/{id}")
    public ResponseEntity<Sujet> getSujetById (@PathVariable("id") Long id) {
    	Sujet sujet = sujetService.findSujetById(id);
        return new ResponseEntity<>(sujet, HttpStatus.OK);
    }
    @PostMapping("/sujet/add")
    public ResponseEntity<Sujet> addSujet(@RequestBody Sujet sujet) {
    	Sujet newSujet = sujetService.addSujet(sujet);
        return new ResponseEntity<>(newSujet, HttpStatus.CREATED);
    }

 



}
