package com.deloitte.employee.controller;

import java.io.IOException; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.deloitte.employee.dao.EmployeeDao;
import com.deloitte.employee.model.Employee;
import com.deloitte.employee.model.EmploymentHistory;
import com.deloitte.employee.service.EmployeeService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	@RequestMapping("/")
	public ModelAndView home(){
	
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "List of Employees");
		List<Employee> employees = employeeService.findAll();
//		System.out.println(employees);
		mav.addObject("employees", employees);
		return mav;
	}
	
	@RequestMapping(value="/search", method = RequestMethod.POST)
	public ModelAndView search(@Param("empId") Long empId,@Param("firstName") String firstName, @ModelAttribute("emp")Employee employee) {
		ModelAndView mav = new ModelAndView("home");
		List<Employee> employees = new ArrayList<>();
		if(empId !=null)
		{
		employees = employeeDao.search(empId);
		}
		else if(firstName!=null)
		{
			employees= employeeDao.search(firstName);
		}
		else {
			System.out.println("name is null");
		}
//		System.out.println(employee);
//		employees.add(employee);
//		mav.addObject("employee",employee);
		mav.addObject("employees",employees);
		return mav;
		
	}
	
	@RequestMapping("/employee")
	public ModelAndView addExpense() {
		ModelAndView mav = new ModelAndView("employee");
		mav.addObject("employee", new Employee());
		return mav;
	}
	
	@RequestMapping(value="/employee",method= RequestMethod.POST)
	public String save(@Valid @ModelAttribute("employee") Employee employee,BindingResult br) {
		if(br.hasErrors())
		{
			return "employee";
		}
		else {
		employeeService.save(employee);
		return "redirect:/";
		}
	}
	
	@RequestMapping(value = "/employee/{empId}")
	public ModelAndView edit(@PathVariable("empId")Long empId) {
		ModelAndView mav= new ModelAndView("employee");
		Employee employee = employeeService.findById(empId);
		mav.addObject("employee", employee);
		return mav;
	}
	
	@RequestMapping(value = "/{empId}")
	public String delete(@PathVariable("empId") Long empId) {
		employeeService.delete(empId);
		return "redirect:/";
	}
	
	@RequestMapping(value="/history/{empId}")
	public ModelAndView viewHistory(@PathVariable ("empId") Long emp_id) {
		ModelAndView mav= new ModelAndView("history");
		List<EmploymentHistory> employees=employeeDao.findHistory(emp_id);
		 
			
				 mav.addObject("employees",employees);
				 
		 Employee employee= employeeService.findById(emp_id);
		 mav.addObject("employee",employee);
		 
		 return mav;
		 }
	
	@RequestMapping(value="/export",method=RequestMethod.GET)
	public void exportToCSV(HttpServletResponse response) throws IOException {
	response.setContentType("text/csv");
	DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
	String currentDateTime = dateFormatter.format(new Date());
	 
	String headerKey = "Content-Disposition";
	String headerValue = "attachment; filename=Employee_" + currentDateTime + ".csv";
	response.setHeader(headerKey, headerValue);
	 
	List<Employee> listUsers = employeeService.findAll();
	 
	ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
	String[] csvHeader = {"Emp Id", "Name", "Doj", "Post", "Level","Mobile","Personal Mail","Office Mail","Dob",
	"Blood Group","Pan no","Aadhar no"};
	String[] nameMapping = {"empId", "firstName", "doj", "postName", "empLevel","mobileNum","emailId","officeMail","dob",
	"bloodGroup","panNum","aadhaarNum"};
	 
	csvWriter.writeHeader(csvHeader);
	 
	for (Employee user : listUsers) {
	csvWriter.write(user, nameMapping);
	}
	 
	csvWriter.close();
	 
	}

//	@RequestMapping("/employee")
//	public String submitForm(@Valid BindingResult br)
//	{
//		if(br.hasErrors()) {
//			System.out.println("view page called");
//			return "employee";
//		}
//		else {
//			return "home";
//		}
//	}
	}

