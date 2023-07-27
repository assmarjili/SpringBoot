package com.assma.pfe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assma.pfe.entities.Role;
import com.assma.pfe.repositories.RoleRepository;
import com.assma.pfe.services.impl.IRoleService;


@Service
public class RoleServiceImplement implements IRoleService {

	
	@Autowired
	RoleRepository roleRep;
	@Override
	public Role addRole(Role r) {
		// TODO Auto-generated method stub
		return roleRep.save(r);
	}
}
