package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		Scanner sc = new Scanner(System.in);
		List<Department> list = new ArrayList<>();
		
		
		System.out.println("===== TEST 1: Department findById =====");
		Department department = departmentDao.findById(3);
		
		System.out.println(department);
		
		System.out.println("\n===== TEST 2: Department findAll =====");
		list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===== TEST 3: Department Insert =====");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		
		System.out.println("\n===== TEST 4: Department update =====");
		department = departmentDao.findById(8);
		department.setName("Arts");
		departmentDao.update(department);
		System.out.println("Updated! The updated department is: " + department);

		System.out.println("\n===== TEST 5: Department delete =====");
		System.out.print("Enter id for delete test: ");
		int testId = sc.nextInt();
		departmentDao.deleteById(testId);
		System.out.println("Deletion completed!");
		
	sc.close();
	}
}
