package com.siit.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class CatalogueService {

    @Autowired
    public CatalogueService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    private final StudentsRepository studentsRepository;
    public String createStudentCatalogue(){
        List<Student> studentListToBeProcessed = studentsRepository.getStudents();
        String result = "";

        for (Student student: studentListToBeProcessed) {
            result = result.concat(student.getFirstName()).concat(" ").concat(student.getLastName().concat("<br></br>"));
        }
        return result;
    }

    public String createStudentWithGradesCatalog(){
        List<Student> studentListToBeProcessed = studentsRepository.getStudents();
        String studentsWithGrades = "";
        for (Student student : studentListToBeProcessed) {
            student.getAverage();
            studentsWithGrades = studentsWithGrades.concat(student.toString().concat("<br></br>"));
        }
        return studentsWithGrades;
    }
}
