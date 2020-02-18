package emp;

public class EmployeeManagement {
	int employee_id,employee_salary;
	String employee_name,employee_location;
	public EmployeeManagement(int employee_id, int employee_salary, String employee_name, String employee_location) {
		super();
		this.employee_id = employee_id;
		this.employee_salary = employee_salary;
		this.employee_name = employee_name;
		this.employee_location = employee_location;
	}

	


	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_location() {
		return employee_location;
	}

	@Override
	public String toString() {
		return "EmployeeManagement [employee_id=" + employee_id + ", employee_salary=" + employee_salary
				+ ", employee_name=" + employee_name + ", employee_location=" + employee_location + "]";
	}




	public void setEmployee_location(String employee_location) {
		this.employee_location = employee_location;
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			EmployeeManagement e=new EmployeeManagement(222,33333,"venkat","paris");
       System.out.println(e.toString());			

	}

}
