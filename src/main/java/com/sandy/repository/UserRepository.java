package com.sandy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandy.model.UserRecord;

public interface UserRepository extends JpaRepository<UserRecord,Integer>{

}
