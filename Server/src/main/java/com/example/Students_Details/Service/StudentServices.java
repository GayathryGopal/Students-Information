package com.example.Students_Details.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Students_Details.Entity.Student;
import com.example.Students_Details.Repo.StudentRepo;

@Service

public class StudentServices {

    @Autowired
    private StudentRepo repo;


    public String generateAdmissionNumber() {
        List<Student> students = repo.findAll();
        int count = students.size() + 1;
        return "R-" + String.format("%03d", count);
         // Format to R-001, R-002, etc.
    }


    public void saveorUpdate(Student students) {

        repo.save(students);
    }


    public Iterable<Student> listAll() {
        return this.repo.findAll();
    }



    
}
