package net.az3l1t.student.dao.controller;

import net.az3l1t.student.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentController {
    public void save(@RequestBody Student student);
    public ResponseEntity<List<Student>> findAllStudents();
    public ResponseEntity<List<Student>> findAllStudents(@PathVariable("school-id") Integer schoolId);
}
