package com.example.student_management_system;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController // indicates that this class is responsible for handling the http request and respond in RESTful manner
public class StudentController {
    //we will do crud operations here
    Map<Integer,Student> studentDB = new HashMap<>();
    @PostMapping("/add")
    public String createstudent(@RequestBody Student student){
        if(studentDB.containsKey(student.getAdmiNo())){ System.out.println("This student is already enrolled ");return null;}
        studentDB.put(student.getAdmiNo(),student);
        return "Student created susscessfully";
    }

    @GetMapping("/get_info")
    public Student checkstudent(@RequestParam("id") int admiNo){

        return studentDB.get(admiNo);
    }
    @PutMapping("/update_info")
    public Student changeinfo(@RequestParam("id") int admiId, @RequestParam("course") String course){
        Student s = studentDB.get(admiId);
        s.setCourse(course);
        return s;
    }
    @DeleteMapping("/delete")
    public String deletestudent(@RequestParam("id") int admiId){
        if(!studentDB.containsKey(admiId)) return "This student is not enrolled ";
        studentDB.remove(admiId);
        return "Student Removed Successfully";
    }
}
