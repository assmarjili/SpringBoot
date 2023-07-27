package com.assma.pfe.payload;

import java.util.List;

public class JwtResponse {

	    private String email;
	    private List<String> roles;
	    private String jwt;	   
	    
	    public JwtResponse(String email, List<String> roles, String jwt) {
	        this.email = email;
	        this.roles = roles;
	        this.jwt = jwt;
	    }
	    
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public List<String> getRoles() {
	        return roles;
	    }
	    public void setRoles(List<String> roles) {
	        this.roles = roles;
	    }
	    public String getJwt() {
	        return jwt;
	    }
	    public void setJwt(String jwt) {
	        this.jwt = jwt;
	    }

	    
	
}
