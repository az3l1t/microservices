package net.az3l1t.school.dao.controller;

import net.az3l1t.school.dao.controller.model.FullSchoolResponse;
import net.az3l1t.school.entity.School;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface SchoolController {
    public void saveSchool(@RequestBody School school);
    public ResponseEntity<List<School>> findAllSchools();
    public ResponseEntity<FullSchoolResponse> findAllSchoolsWithStudents(@PathVariable("school-id") Integer schoolId);
}
