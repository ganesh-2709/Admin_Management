package com.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.admin.entity.EmployeesData;
import com.admin.repository.EmployeeRepo;
import com.admin.service.EmployeeService;

//@RequestMapping("/admin/")
@Controller
public class EmployeeController {
	@Autowired
	public EmployeeService service;
	
	@Autowired
	EmployeeRepo repo;
	
	
	@GetMapping("/")
	public String fetchall(Model model)
	{		
		List<EmployeesData> list=service.fetchall();
		
		model.addAttribute("getemp",list);
		return "index";
	}
	//======================add new employee=========================================
	@GetMapping("/addemp")
	public String addemp(Model model)
	{
		//model.addAttribute("addnew",new EmployeesData());

		return "addemp";
	}
	
	//@ResponseBody
	@PostMapping("/add")
	public  String insert(@ModelAttribute EmployeesData data)
	{
		 service.insert(data);
		 return "redirect:/admin";
	}
//==================================update=========================================	
	
	@GetMapping("/updateemp")
	public String updateemp()
	{
			
		return "updateemp";
	}
	
	//@ResponseBody
	@PostMapping("/update")
	public  String update(@ModelAttribute EmployeesData data,Model model)
	{
	Optional<EmployeesData>	emp=service.getempbyid(data.getEmpId());
		
		if(emp.isPresent())
		{		
		service.insert(data);
		}
		else
		{
			System.out.println("invalid");
			model.addAttribute("errorMessage", "Invalid empId, Please try again with valid empId");
		}
		
		return "redirect:/admin";
	}
	
	//==========================================delete==================================
	
	@GetMapping("/delete")
	public String deleteemp()
	{
			
		return "delete";
	}
	
	
	@PostMapping("/remove")
	public String delete(@ModelAttribute EmployeesData data,Model model)
	{
		Optional<EmployeesData>	emp=service.getempbyid(data.getEmpId());
		if(emp.isPresent())
		{		
			service.delete(data.getEmpId());
		}
		else
		{
			System.out.println("invalid");
			model.addAttribute("errorMessage", "Invalid empId, Please try again with valid empId");
		}
		return "redirect:/admin";
	}
	

}
