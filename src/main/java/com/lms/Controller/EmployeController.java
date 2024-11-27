package com.lms.Controller;

import com.lms.dto.EmployeDto;
import com.lms.util.emailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.Entity.Employee;
import com.lms.service.employeService;

import java.util.List;

@SuppressWarnings("unused")
@Controller
public class EmployeController {

	@Autowired
	private emailServices ems;

	@Autowired
	private employeService es;


	@RequestMapping("/view")
	public String ViewCreateReg() {
		return "createReg";
	}

	@RequestMapping("/save")
	public String CreateReg(@ModelAttribute Employee e, ModelMap model) {
		es.saveReg(e);
		model.addAttribute("msg", "Record added");
//		ems.sendEmail(); need to add (to,subject,message using requestBody) then send email
		return "createReg";
	}

			//Another Method to add Data
//	@RequestMapping("/save")
//	public String addReg(
//			EmployeDto dto,
//			ModelMap model	) {
//					Employee e = new Employee();
//					e.setEmailId(dto.getName());
//					e.setMobile(dto.getEmailId());
//					e.setName(dto.getMobile());
//			      model.addAttribute("msg", "Record added");
//					return "createReg";
//
//	}

	@RequestMapping("/getAll")
	public String getAll(Employee e,Model model) {
		List<Employee> eds = es.findAll();
		model.addAttribute("ed", eds);
		return "getAll";
	}
	@RequestMapping("/deleteReg")
	public String deleteReg(@RequestParam long id,Model model){
		es.deleteEmpById(id);
		List<Employee> eds = es.findAll();
		model.addAttribute("ed", eds);
		return "getAll";
	}
	@RequestMapping("/UpdateReg")
	public String UpdateReg(@RequestParam long id,Model model){
		Employee em = es.updateById(id);
		model.addAttribute("ed",em);
		return "update";
	}
	@RequestMapping("/updateEmps")
	public String UpdateEmp(Employee ee,Model model){
		es.updateEmploye(ee);
		List<Employee> eds = es.findAll();
		model.addAttribute("ed", eds);
		return "getAll";
	}

	@RequestMapping("/sendem")
	public String sendem(@RequestParam long id,Model model){
		Employee em = es.updateById(id);
		model.addAttribute("ed",em);
		return "SendEmail";
	}

	@RequestMapping("/send")
	public String emailSend(@RequestParam("to") String to,
							@RequestParam("sub") String sub,
							@RequestParam("mssg") String mssg, Model model ){
		ems.sendEmail(to,sub,mssg);
		List<Employee> eds = es.findAll();
		model.addAttribute("ed", eds);
		return "getAll";
	}

}
