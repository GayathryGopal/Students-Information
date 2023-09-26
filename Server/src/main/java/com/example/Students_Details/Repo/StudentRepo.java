package com.example.Students_Details.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Students_Details.Entity.Student;

public interface StudentRepo extends MongoRepository<Student,String> {


}
    
