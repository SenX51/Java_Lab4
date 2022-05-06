package com.company;


public class Human
{
	private Integer id;
	private String name;
	private String gender;
	private Department department;
	private Float salary;
	private String birthDate;

	public Human(String[] line)
	{
		try
		{
		id = Integer.parseInt(line[0]);
		name = line[1];
		gender = line[2];
		birthDate = line[3];
		department = Department.TryAssign(line[4]);
		salary = Float.parseFloat(line[5]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			return;
		}
	}

	public void PrintInfo()
	{
		System.out.println("[" + id + "] " + name + " | " + gender + " | " + birthDate + " | Department: " + department.name + " | $" + salary);
	}
}
