package net.az3l1t.student.service;

import net.az3l1t.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    public void saveStudent(Student student);
    public List<Student> findAllStudents();
    List<Student> findAllStudentsBySchool(Integer schoolId);
}
