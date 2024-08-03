package com.briz.exceptapp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
@Autowired
EmployeeRepository erepo;
 //THIS IS THE FIRST WAY TO HANDLE EXCEPTION HERE 
@RequestMapping("/{id}")
public Optional<Employee> checkid(@PathVariable int id)
{
Optional<Employee> employee=erepo.findById(id); // findbyid is not present in repo note this 
if(employee.isEmpty()) // must use this method 
{
	throw new IdNotFoundException("This is not valid id");// if parameter is given the must be all type cons in entity	
}
else
{
return employee;
}
}
}


//BELOW IS THIRD TYPE OF HANDLING EXCEPTION IMPORTANT OPTIONAL CLASS
/*
@RequestMapping("/by/{id}")
public Optional<Employee> byid(@PathVariable int id)
{
	Optional<Employee>employee=erepo.findById(id);
	
	if(employee.isPresent())
	{		
		return employee;
	}
	else
	{
		throw new IdNotFoundException();
	}
}
*/
// THIS IS FOURTH TYPE OF EXCEPTION HANDLING STYLE
/*
@RequestMapping("/by/{id}")
public Employee byid(@PathVariable int id)
{
	Employee employee=erepo.findById(id).
			                              orElseThrow(()->
	                                           new IdNotFoundException());
	return employee;			
}
}
*/
