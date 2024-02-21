package com.jayesh.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.jayesh.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	 
}
