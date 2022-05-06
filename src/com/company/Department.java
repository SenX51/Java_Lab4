package com.company;

import java.util.LinkedList;

public class Department
{
	public static LinkedList<Department> departments = new LinkedList<>();
	public Integer id;
	public String name;

	public Department(Integer _id, String _name)
	{
		id = _id;
		name = _name;
	}

	/**
	 * Метод, присваивающий уже существующее отделение с таким же названием/создающий новое
	 * @param dep название отделения
	 * @return
	 */
	public static Department TryAssign(String dep)
	{
		for (Department d : departments)
		{
			if (d.name.equals(dep))
				return d;
		}
		departments.add(new Department(departments.size(), dep));
		return departments.getLast();
	}
}
