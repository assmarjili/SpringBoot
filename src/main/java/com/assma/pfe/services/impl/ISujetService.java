package com.assma.pfe.services.impl;

import java.util.List;

import com.assma.pfe.entities.Sujet;

public interface ISujetService {
	public Sujet addSujet(Sujet sujet);

	public List<Sujet> findAllSujets();

  
    public Sujet findSujetById(Long idSujet);

}
