package com.lms.service;

import java.util.List;

import com.lms.dto.EmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.Entity.Employee;
import com.lms.Repository.EmplyeeRepo;


@Service
public class employeService {
	
	@Autowired
	private EmplyeeRepo em;
	
	public void saveReg(Employee e) {
		
		em.save(e);
	}


	public List<Employee> findAll() {
		return em.findAll();
	}


	public void deleteEmpById(long id) {
		em.deleteById(id);
	}


	public Employee updateById(long id) {
		Employee e = em.findById(id).get();
		return e;
	}

	public void updateEmploye(Employee dto) {
		Employee e = new Employee();
		e.setId(dto.getId());
		e.setEmailId(dto.getEmailId());
		e.setMobile(dto.getMobile());
		e.setName(dto.getName());
		em.save(e);
	}
}

