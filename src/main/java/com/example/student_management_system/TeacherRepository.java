package com.example.student_management_system;

import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TeacherRepository {
    Map<Integer,Teacher> teacherDB = new HashMap<>();

    public void addteacher(Teacher teacher) {
        //System.out.print(teacher.getTeacher_id());
        teacherDB.put(teacher.getTeacher_id(),teacher);
    }

    public Teacher getinfo(int teacher_id) {
       // System.out.print(teacherDB.get(teacher_id));
        return teacherDB.get(teacher_id);
    }

    public Teacher updateinfo(int teacherId, String course) {
        Teacher t = teacherDB.get(teacherId);
        t.setCourse(course);
        return t;
    }

    public boolean deleteT(int techerId) {
        if(!teacherDB.containsKey(techerId)) return false;
        teacherDB.remove(techerId);
        return true;
    }
}
