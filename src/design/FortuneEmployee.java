package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) throws Exception {

		EmployeeInfo emp = new EmployeeInfo();
		EmployeeInfo emp1 = new EmployeeInfo("farzad", 100, 4000);
		EmployeeInfo emp2 = new EmployeeInfo("ahmed", 101, 3000);
		EmployeeInfo emp3 = new EmployeeInfo("nasir", 102, 2000);
		EmployeeInfo emp4 = new EmployeeInfo("fahim", 103, 1000);
		emp.benefitLayout();
		System.out.println("Employee 1 is : " + emp1.assignDepartment("DEVELOPER"));
		System.out.println("Employee 2 is : " + emp2.assignDepartment("IT"));
		System.out.println("Employee 3 is : " + emp3.assignDepartment("QA TESTER"));
		System.out.println("Employee 4 is : " + emp4.assignDepartment("BA"));

		emp1.setSalary(4000);
		emp1.calculateSalary(emp1.getSalary());
		emp2.setSalary(3000);
		emp2.calculateSalary(emp2.getSalary());
		emp3.setSalary(2000);
		emp3.calculateSalary(emp3.getSalary());
		emp4.setSalary(1000);
		emp4.calculateSalary(emp4.getSalary());

		emp1.calculateEmployeeBonus(emp1.getSalary(), emp1.getPerformance());
		emp2.calculateEmployeeBonus(emp2.getSalary(), emp2.getPerformance());
		emp3.calculateEmployeeBonus(emp3.getSalary(), emp3.getPerformance());
		emp4.calculateEmployeeBonus(emp4.getSalary(), emp4.getPerformance());

		//
		// System.out.println(emp1.getSalary());
		emp1.setSalary(50000);
		emp1.calculateEmployeePension(emp1.getSalary());
		emp2.setSalary(60000);
		emp2.calculateEmployeePension(emp2.getSalary());
		emp3.setSalary(70000);
		emp3.calculateEmployeePension(emp3.getSalary());
		emp4.setSalary(80000);
		emp4.calculateEmployeePension(emp4.getSalary());


	}

}