package com.example.student_management_system;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepository {
    Map<Integer,Student> studentDB = new HashMap<>();

    public void createstudent(Student student) {
        studentDB.put(student.getAdmiNo(),student);
    }

    public Student checkstudent(int admiNo) {
        return studentDB.get(admiNo);
    }

    public Student changeinfo(int admiId, String course) {
        Student s = studentDB.get(admiId);
        s.setCourse(course);
        return s;
    }

    public boolean deletestudent(int admiId) {
        if(!studentDB.containsKey(admiId)) return false;
        else {
            studentDB.remove(admiId);
            return true;
        }
    }
}
