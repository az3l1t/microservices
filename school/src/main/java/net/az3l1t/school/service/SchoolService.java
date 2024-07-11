package net.az3l1t.school.service;

import net.az3l1t.school.dao.controller.model.FullSchoolResponse;
import net.az3l1t.school.entity.School;

import java.util.List;

public interface SchoolService {
    public void saveSchool(School school);
    public List<School> findAllSchools();
    FullSchoolResponse findSchoolsWithStudents(Integer schoolId);
}
