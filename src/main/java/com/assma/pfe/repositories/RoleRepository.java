package com.assma.pfe.repositories;

import java.util.Optional;

import com.assma.pfe.entities.Role;
import com.assma.pfe.enumeration.ERole;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}