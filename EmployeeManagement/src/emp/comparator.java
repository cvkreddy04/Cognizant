package emp;
import java.util.*;
 class Employee1{
	int employee_id,employee_salary;
	String employee_name,employee_location;
	
	public Employee1(int employee_id, int employee_salary, String employee_name, String employee_location) {
		super();
		this.employee_id = employee_id;
		this.employee_salary = employee_salary;
		this.employee_name = employee_name;
		this.employee_location = employee_location;
	}
}
class NameComparator implements Comparator<Employee>{

	
	public int compare(Employee o1, Employee o2) {
		
		// TODO Auto-generated method stub
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		return e1.employee_name.compareTo(e2.employee_name);
	}
}
class LocationComparator implements Comparator<Employee>{

	
	public int compare(Employee o1, Employee o2) {
		
		// TODO Auto-generated method stub
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		return e1.employee_location.compareTo(e2.employee_location);
	}
}


public class comparator {

	public static void main(String [] args) {
		ArrayList<Employee> e=new ArrayList<Employee>();
		e.add(new Employee(100,22000,"cvkreddy","pune"));
		e.add(new Employee(101,23000,"akreddy","hyd"));
		e.add(new Employee(102,24000,"zreddy","adb"));
//		Iterator itr;
		/*Iterator.itr=ArrayList.iterator();
		while(itr.hasnext) {
			System.out.println(itr.next());
		}
	}*/
		// TODO Auto-generated method stub
Collections.sort(e,new NameComparator());
for(Employee i:e) {
System.out.println(i.employee_name);
}
Collections.sort(e,new LocationComparator());
for(Employee h:e) {
System.out.println(h.employee_location);

	}
	}

}


/*public class comparator {
public class NameComparator implements Employee {
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		return s1.name.compareTo(s2.name);
	}
}
}
*/