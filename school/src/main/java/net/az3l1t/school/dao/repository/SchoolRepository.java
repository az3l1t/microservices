package net.az3l1t.school.dao.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import net.az3l1t.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
