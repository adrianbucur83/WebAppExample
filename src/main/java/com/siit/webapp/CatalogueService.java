package com.siit.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

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

        studentListToBeProcessed.sort(Comparator.comparingDouble(Student::getAverage).reversed());
        StringBuilder strBuilder = new StringBuilder();

        for (Student s : studentListToBeProcessed) {
            strBuilder.append(s.toString()).append("<br></br>");
        }
        return strBuilder.toString();
    }
}
