package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractEmployeeClass{

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private int employeeId;
	private String empName;
	private String departmentName;
	private double salary;
	private int performance;


	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public double getSalary() {

		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}


	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	@Override
	public void service(){
		companyName="PNT.EDU";
		System.out.println(CompanyName+"provide training for selenium,qtp & database from"+address);
	}
	public String assignDepartment(String departmentName){
		this.departmentName=departmentName;
		return departmentName;
	}
	public double calculateSalary(double salary){
return salary;
	}


	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */

	//employee constructor

	public EmployeeInfo(){}

	public EmployeeInfo(int employeeId){
		this.employeeId=employeeId;
	}
	public EmployeeInfo(String empName,int employeeId,double salary){
		this.empName=empName;
		this.employeeId=employeeId;
		this.salary=salary;
	}



	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;
		return total;
	}
	public static double calculateEmployeeBonus(double Salary, double performance){
		performance=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the year for employee :");
		int year=sc.nextInt();
		if (year>=5){
			performance=.3;
			System.out.println("great ! good work");
		}
		else if (year<=2 && year >=1){
			performance=.2;
			System.out.println("good ! keep doing performance");
		}
		else System.out.println("yor are almost in your goal");
		double total=(Salary*performance);
		return total;

	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */

	public static double calculateEmployeePension(double salary){
		double total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2005): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		//Calculate pension
		String startYear=convertedJoiningDate.substring(convertedJoiningDate.length()-4);
		String currentYear=convertedJoiningDate.substring(convertedTodaysDate.length()-4);


		int start=Integer.parseInt(startYear);
		int current=Integer.parseInt(currentYear);

		if((current-start)>= 10){
			total= salary *.5;
		}else if ((current-start)==9) {
			total = salary * .4;
		}
			else if((current-start)==8){
				total=salary*.3;
			}else if ((current-start)==7){
				total=salary*.25;
		}else if ((current-start)==6){
				total=salary*.2;

		}else if ((current-start)==5){
				total= salary*.1;
		}else if ((current-start)<=4){
				total=0;
			System.out.println("sorry , you are not eligible");
		}
		else {System.out.println("you got problem");}
		System.out.println("Employee pension is:"+"$"+total);


		return total;
	}

	@Override
	public void describeCompany(String Mission) {

	}

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public String employeeName() {
		return null;
	}

	@Override
	public void assignDepartment() {


	}

	@Override
	public int calculateSalary() {
		return 0;
	}

	@Override
	public void benefitLayout() {

	}

	@Override
	public int employeeAge() {
		return 0;
	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];

			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}