package com.infotech.client;

import com.infotech.exception.InvalidEntityFoundException;
import com.infotech.maker.Employee;
import com.infotech.maker.MarkerEntityService;


public class Test {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		try {
			new MarkerEntityService().save(employee);
		} catch (InvalidEntityFoundException e) {
			e.printStackTrace();
		}
	}
}
