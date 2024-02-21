package com.jayesh.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jayesh.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
	 
}
