package com.company;

import java.util.Date;

public class Human
{
	private Integer id;
	private String name;
	private String gender;
	private Department department;
	private Float salary;
	private Date birthDate; //string?

	public Human(String[] line)
	{
		id = Integer.parseInt(line[0]);
	}

}
