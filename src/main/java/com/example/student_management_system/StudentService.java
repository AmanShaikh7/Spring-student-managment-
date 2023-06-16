package com.example.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentrepository;
    public String createstudent(Student student){
        studentrepository.createstudent(student);
        return "Student added succesfully";
    }

    public Student checkstudent(int admiNo) {
        return studentrepository.checkstudent(admiNo);
    }

    public Student changeinfo(int admiId, String course) {
        return studentrepository.changeinfo(admiId,course);
    }

    public boolean deletestudent(int admiId) {
        boolean ans = studentrepository.deletestudent(admiId);
        if(ans) return true;
        else return false;
    }
}
