package com.acciojob.library_management_sysytems.Services;
import com.acciojob.library_management_sysytems.Entities.Student;
import com.acciojob.library_management_sysytems.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student has been saved to the DB";
    }
}
