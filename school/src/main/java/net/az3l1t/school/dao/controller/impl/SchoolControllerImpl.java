package net.az3l1t.school.dao.controller.impl;

import net.az3l1t.school.dao.controller.SchoolController;
import net.az3l1t.school.dao.controller.model.FullSchoolResponse;
import net.az3l1t.school.entity.School;
import net.az3l1t.school.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/schools")
public class SchoolControllerImpl implements SchoolController {
    private final SchoolService schoolService;

    public SchoolControllerImpl(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSchool(@RequestBody School school) {
        schoolService.saveSchool(school);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<School>> findAllSchools() {
        return ResponseEntity.ok(schoolService.findAllSchools());
    }

    @Override
    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllSchoolsWithStudents(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
    }
}
