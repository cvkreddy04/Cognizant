package emp;
	import java.util.*;
import java.util.Map.Entry;
	public class{
	 /*class Employee1{
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

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	}*/
	public class map {                                 

		public static void main(String [] args) {
			/*Employee e=new Employee();
			Map<Employee,String>map =new HashMap<Employee,String>();
			map.put(e,"Reddy");
			//map.put(101,"akreddy");
			//map.put(102,"zreddy");
			 for (Entry<Employee, String> entry : map.entrySet())
		        {
		            System.out.println(entry.getKey().getName() + "-" + entry.getValue());
		        }
		        
		        System.out.println(map.get(e));        
		        System.out.println(map.get(new Employee()));
		      */
			try {
			FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
            fout.write(65);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    
     }    
}  
		    }
		    
	}
	
	/*Collections.sort(e,new NameComparator());
	for(Employee i:e) {
	System.out.println(i.employee_name);
	}
	Collections.sort(e,new LocationComparator());
	for(Employee h:e) {
	System.out.println(h.employee_location);

		}
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
