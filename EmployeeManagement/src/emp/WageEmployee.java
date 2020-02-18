package emp;

public class WageEmployee extends EmployeeManagement {

     int numbers,hours;	
	
   public WageEmployee(int employee_id, int employee_salary, String employee_name, String employee_location,int numbers,int hours) {
		super(employee_id, employee_salary, employee_name, employee_location);
	this.numbers=numbers;
	this.hours=hours;
   }


	@Override
public String toString() {
	return "WageEmployee [numbers=" + numbers + ", hours=" + hours + ", employee_id=" + employee_id
			+ ", employee_salary=" + employee_salary + ", employee_name=" + employee_name + ", employee_location="
			+ employee_location + "]";
}


	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	
}
