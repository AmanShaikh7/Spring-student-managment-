package com.example.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @PostMapping("/add")
    public ResponseEntity addteacher(@RequestBody Teacher teacher){
        teacherService.addteacher(teacher);
        return new ResponseEntity("Teacher Added Successfully", HttpStatus.CREATED);
    }
    @GetMapping("/getTeacherInfo")
    public ResponseEntity getinfo(@RequestParam("id") int teacher_id){
        Teacher t = teacherService.getinfo(teacher_id);
        if(t==null){ return new ResponseEntity("No such Teacher found",HttpStatus.NOT_FOUND);}
        return new ResponseEntity(t,HttpStatus.ACCEPTED);
    }
    @PutMapping("/updateinfo")
    public ResponseEntity updateinfo(@RequestParam("id") int teacher_id, @RequestParam("course") String course){
       Teacher t = teacherService.updateinfo(teacher_id,course);
       return new ResponseEntity(t,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteT(@RequestParam("id") int techer_id){
        boolean response = teacherService.deleteT(techer_id);
        if(response)  return new ResponseEntity("Teacher Deleted Successfully!!",HttpStatus.GONE);
        return new ResponseEntity("No such Teacher Exist",HttpStatus.NOT_FOUND);
    }


}
