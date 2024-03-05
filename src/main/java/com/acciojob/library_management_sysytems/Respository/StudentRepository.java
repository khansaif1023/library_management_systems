package com.acciojob.library_management_sysytems.Respository;

import com.acciojob.library_management_sysytems.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
