package com.assma.pfe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assma.pfe.entities.Role;
import com.assma.pfe.services.impl.IRoleService;



@RestController
public class RoleController {

	@Autowired
	IRoleService roleServ;
	@PostMapping("/addRole")
	public Role addRole(@RequestBody Role r)
	{
		return roleServ.addRole(r);
	}
	
}
