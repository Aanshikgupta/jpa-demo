package com.aanshik.demojpa.Repository;

import com.aanshik.demojpa.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpaRepo extends JpaRepository<Student, Integer> {
}
