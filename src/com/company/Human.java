package com.company;


public class Human
{
	private Integer id;
	private String name;
	private String gender;
	private Department department;
	private Float salary;
	private String birthDate;

	/**
	 * Конструктор, принимающий на вход строку из csv файла и вытскиваиющий из него информацию
	 * @param line строка из csv файла
	 */
	public Human(String line)
	{
		String split[] = line.split(";");
		try
		{
		id = Integer.parseInt(split[0]);
		name = split[1];
		gender = split[2];
		birthDate = split[3];
		department = Department.TryAssign(split[4]);
		salary = Float.parseFloat(split[5]);
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
