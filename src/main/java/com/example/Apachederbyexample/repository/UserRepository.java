package com.example.Apachederbyexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Apachederbyexample.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, Integer>{
    
}
