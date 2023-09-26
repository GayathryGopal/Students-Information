package com.example.Students_Details.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;



@Document(collection = "students")
public class Student {

    @Id
    private String _id;

    @NotBlank(message = "Admission number is required")
    private String admissionNumber;

    @NotBlank(message = "Student name is required")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name should contain only letters and spaces")
    private String studentname;

    @NotBlank(message = "Date of Birth is required")
    private String studentdob;

    @NotBlank(message = "Student class is required")
    private String studentclass;

    @NotBlank(message = "Student division is required")
    private String studentdivision;

    @NotBlank(message = "Gender is required")
    private String gender;



    public Student() {
       
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentdob() {
        return studentdob;
    }

    public void setStudentdob(String studentdob) {
        this.studentdob = studentdob;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public String getStudentdivision() {
        return studentdivision;
    }

    public void setStudentdivision(String studentdivision) {
        this.studentdivision = studentdivision;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student [_id=" + _id + ", admissionNumber=" + admissionNumber + ", studentname=" + studentname
                + ", studentdob=" + studentdob + ", studentclass=" + studentclass + ", studentdivision=" + studentdivision
                + ", gender=" + gender + "]";
    }
}
