package com.assma.pfe.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assma.pfe.entities.Sujet;
import com.assma.pfe.repositories.SujetRepository;
import com.assma.pfe.services.impl.ISujetService;

@Service
@Transactional
public class SujetService implements ISujetService{
	@Autowired
	private SujetRepository sujetRepository;
	
    
    public SujetService(SujetRepository sujetRepository) {
		this.sujetRepository = sujetRepository;
	}
	public Sujet addSujet(Sujet sujet) {
		System.out.println("sujet+++++++++++++++++++++++"+ sujet.toString());
        return sujetRepository.save(sujet);
    }

	public List<Sujet> findAllSujets() {
        return sujetRepository.findAll();
    }

  
    public Sujet findSujetById(Long idSujet) {
        return sujetRepository.findById(idSujet).get();
    }

 

}
