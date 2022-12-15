package com.siit.webapp;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentsRepository {

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Mihai", "Pop", 6, 10, 9);
        Student student2 = new Student("Roxana", "Dobre", 8, 10, 8);
        Student student3 = new Student("Vali", "Topescu", 9, 9, 9);
        Student student4 = new Student("Andreea", "Lupau", 10, 10, 9);
        Student student5 = new Student("Nicoleta", "Pop", 6, 8, 10);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        return studentList;
    }
}
