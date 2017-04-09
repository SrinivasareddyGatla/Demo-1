package com.example.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.user.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{

	public UserModel getUserById(final Long Id);
}
