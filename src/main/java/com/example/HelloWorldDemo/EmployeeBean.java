package com.example.HelloWorldDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
		
	private int id;
	private String name;
	@Autowired
	private DepartmentBean deptBean;
	
	public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
	
	public EmployeeBean() {}
	

	@Autowired
	public EmployeeBean(DepartmentBean deptBean) {
		logger.trace("*** AutoWoring by using @Autowire anootation as constructor **");
		this.deptBean = deptBean;
	}
	
	public int getid() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public DepartmentBean getDeptBean() {
		return this.deptBean;
	}
	
	
	@Autowired
	public void setDeptBean(DepartmentBean deptBean) {
		logger.trace("***AutoWoring by using @Autowire anootation as SETTER ***");
		this.deptBean = deptBean;
	}
	
	public void showEmployeeDetails() {
		logger.debug("Employee Id : {}",id);
		logger.debug("Employee Name : {}",name);
		deptBean.setDeptName("Information Technology");
		logger.debug("Department ; {} ", deptBean.getDeptName());
	}
			
}
