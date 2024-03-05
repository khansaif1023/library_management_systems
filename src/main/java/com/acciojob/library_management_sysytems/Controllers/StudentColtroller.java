package com.acciojob.library_management_sysytems.Controllers;
import com.acciojob.library_management_sysytems.Entities.Student;
import com.acciojob.library_management_sysytems.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/student")
public class StudentColtroller {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        String result= studentService.addStudent(student);
        return result;
    }
}
