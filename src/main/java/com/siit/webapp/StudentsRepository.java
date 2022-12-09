package com.siit.webapp;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentsRepository {

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Mihai", "Pop");
        Student student2 = new Student("Roxana", "Dobre");
        Student student3 = new Student("Vali", "Topescu");

        student1.setGrades(List.of(10,8));
        student2.setGrades(List.of(10,10));
        student3.setGrades(List.of(10,9));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        return studentList;
    }
}
