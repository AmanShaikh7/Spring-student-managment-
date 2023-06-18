package com.example.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController // indicates that this class is responsible for handling the http request and respond in RESTful manner
@RequestMapping("/student")
public class StudentController {
    //we will do crud operations here
    @Autowired
    StudentService studentservice;
    @PostMapping("/add")
    public ResponseEntity createstudent(@RequestBody Student student){
        String s = studentservice.createstudent(student);
        return new ResponseEntity(s, HttpStatus.CREATED);
    }

    @GetMapping("/get_info")
    public ResponseEntity checkstudent(@RequestParam("id") int admiNo){
        Student s = studentservice.checkstudent(admiNo);
        if(s==null) return new ResponseEntity("No Such Student in DB",HttpStatus.NOT_FOUND);
        return new ResponseEntity(s,HttpStatus.ACCEPTED);
    }
    @PutMapping("/update_info")
    public ResponseEntity changeinfo(@RequestParam("id") int admiId, @RequestParam("course") String course){
        Student s = studentservice.changeinfo(admiId,course);
        return new ResponseEntity(s,HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deletestudent(@RequestParam("id") int admiId){
        boolean response =studentservice.deletestudent(admiId);
        if(response) return new ResponseEntity("Student Deleted Succesfully",HttpStatus.ACCEPTED);
        else return new ResponseEntity("No such student in DB",HttpStatus.NOT_FOUND);
    }
}
