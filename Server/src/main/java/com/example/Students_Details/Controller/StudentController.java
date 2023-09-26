package com.example.Students_Details.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Students_Details.Entity.Student;
import com.example.Students_Details.Service.StudentServices;



@RestController
@CrossOrigin(origins="*")

@Validated

@RequestMapping("data/student")

public class StudentController {

    @Autowired
    private StudentServices studentServices;


    
        @PostMapping(value = "/save")
        public String saveStudent(@RequestBody Student students) {
         // Generate and set the admission number
        String admissionNumber = studentServices.generateAdmissionNumber();
        students.setAdmissionNumber(admissionNumber);

        studentServices.saveorUpdate(students);
        return students.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Student> getStudents() {
        return studentServices.listAll();
    }
    
}
