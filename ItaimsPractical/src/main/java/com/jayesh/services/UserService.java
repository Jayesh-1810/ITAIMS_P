package com.jayesh.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jayesh.dao.UserRepository;
import com.jayesh.model.User;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	 	public List<User> listAll() {
	        return userRepository.findAll();
	    }
	     
	    public void save(User user) {
	        userRepository.save(user);
	    }
	     
	    public User get(Integer id) {
	        return userRepository.findById(id).get();
	    }
	     
	    public void delete(User user) {
	        userRepository.delete(user);
	    }

}
