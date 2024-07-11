package net.az3l1t.school.service.impl;

import net.az3l1t.school.dao.client.StudentClient;
import net.az3l1t.school.dao.controller.model.FullSchoolResponse;
import net.az3l1t.school.dao.repository.SchoolRepository;
import net.az3l1t.school.entity.School;
import net.az3l1t.school.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public SchoolServiceImpl(SchoolRepository schoolRepository, StudentClient studentClient) {
        this.schoolRepository = schoolRepository;
        this.studentClient = studentClient;
    }

    @Override
    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    @Override
    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(new School("NOT FOUND", "NOT FOUND"));
        var students = studentClient.findAllStudentsBySchool(schoolId);
        return new FullSchoolResponse(school.getName(), school.getEmail(), students);
    }
}
