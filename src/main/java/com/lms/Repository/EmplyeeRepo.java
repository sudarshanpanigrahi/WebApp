package com.lms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.Entity.Employee;

public interface EmplyeeRepo extends JpaRepository<Employee, Long> {


}
