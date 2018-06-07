package com.example.manyToManyExample2;

import com.example.manyToManyExample2.model.Student;
import com.example.manyToManyExample2.model.Teacher;
import com.example.manyToManyExample2.repo.StudentRepo;
import com.example.manyToManyExample2.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class Controller {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    TeacherRepo teacherRepo;

    @GetMapping("/add")
    private void add(){
        Student student = new Student();
        student.setName("Adam");
        Student student1 = new Student();
        student1.setName("Jan");

        Teacher teacher = new Teacher();
        teacher.setSubject("Matematyka");
        Set<Teacher> teachers = new HashSet<>();
        teachers.add(teacher);

        student.setTeachers(teachers);
        student1.setTeachers(teachers);

        teacherRepo.save(teacher);
        studentRepo.save(student);
        studentRepo.save(student1);
    }
}
