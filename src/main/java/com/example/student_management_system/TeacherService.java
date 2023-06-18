package com.example.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;
    public void addteacher(Teacher teacher) {
        teacherRepository.addteacher(teacher);
    }

    public Teacher getinfo(int teacher_id) {
        return teacherRepository.getinfo(teacher_id);
    }
    public Teacher updateinfo(int teacher_id,String course){
        return teacherRepository.updateinfo(teacher_id,course);
    }

    public boolean deleteT(int techerId) {
        boolean ans =teacherRepository.deleteT(techerId);
        if(ans) return true;
        return false;
    }
}
