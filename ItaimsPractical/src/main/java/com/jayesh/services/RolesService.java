package com.jayesh.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayesh.dao.RolesRepository;
import com.jayesh.model.Roles;

@Service
@Transactional
public class RolesService {
	
	@Autowired
	RolesRepository rolesRepository;
	
	 public List<Roles> listAll() {
	        return rolesRepository.findAll();
	    }
	     
	    public void save(Roles roles) {
	        rolesRepository.save(roles);
	    }
	     
	    public Roles get(Integer id) {
	        return rolesRepository.findById(id).get();
	    }
	     
	    public void delete(Roles roles) {
	    	rolesRepository.save(roles);
	    }

}
