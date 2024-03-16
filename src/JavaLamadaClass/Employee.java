package JavaLamadaClass;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
	String EmployeeName;
	int Salary;
	int Experience;
	String Designation;

	public Employee(String EmployeeName,int Salary,int Experience,String Designation) {
		this.EmployeeName=EmployeeName;
		this.Salary=Salary;
		this.Experience=Experience;
		this.Designation =Designation;

	}

	public static void main(String[] args) {

		ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
		EmployeeList.add(new Employee("Vardhan",30000,5,"AutomationEngineer"));
		EmployeeList.add(new Employee("Krishna",50000,5,"DevopsEngineer"));
		EmployeeList.add(new Employee("Govindha",80000,5,"SoftwareEngineer"));

		Function<Employee,Integer> employeobject = emp ->{

			int sal = emp.Salary; 
			if(sal<=30000)
				return sal *10/100;
			if(sal>30000 && sal<=40000)
				return sal*20/100;
			if(sal>40000 && sal<=50000)
				return sal*30/100;
			return sal;
		};

		Predicate<Integer> p = i -> (i>5000); 

		for(Employee employee:EmployeeList) {
			int SalaryHike = employeobject.apply(employee);
			if(p.test(SalaryHike)) {
				System.out.println(employee.EmployeeName);
				System.out.println(employee.Salary);
				System.out.println(employee.Designation);
			}
		}


	}

}
