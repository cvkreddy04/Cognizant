package emp;
//import java.awt.list;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
//import emp.EmployeeManagement;
 class Employee implements Comparable<Employee>{
	int employee_id,employee_salary;
	String employee_name,employee_location;
	public Employee(int employee_id, int employee_salary, String employee_name, String employee_location) {
		super();
		this.employee_id = employee_id;
		this.employee_salary = employee_salary;
		this.employee_name = employee_name;
		this.employee_location = employee_location;
	}
	public int compareTo(Employee person) {
		return employee_name.compareTo(person.employee_name);
	}


public static class comparable {

	public static void main(String [] args) {
		ArrayList<Employee> e=new ArrayList<Employee>();
		e.add(new Employee(100,22000,"cvkreddy","pune"));
		e.add(new Employee(101,23000,"vkreddy","hyd"));
		e.add(new Employee(102,24000,"zreddy","adb"));
//		Iterator itr;
		/*Iterator.itr=ArrayList.iterator();
		while(itr.hasnext) {
			System.out.println(itr.next());
		}
	}*/
		// TODO Auto-generated method stub
Collections.sort(e);
for(Employee i:e) {
System.out.println(i.employee_name);
	}
	}

}
 }
