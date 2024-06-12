package com.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.Entity.StudentsEntity;

public interface StudentRepository extends JpaRepository<StudentsEntity, Integer>
{

}
