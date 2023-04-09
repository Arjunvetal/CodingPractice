import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	private int id;
	private long salary;
	
	
	public Employee(int id, long salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
}
public class SalarySortDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1,5000));
		list.add(new Employee(2,2000));
		list.add(new Employee(3,7000));
		list.add(new Employee(4,15000));
		list.add(new Employee(5,8000));
		list.add(new Employee(6,25000));
		
		List<Employee> emp=list.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
				.limit(3)
				.collect(Collectors.toList());	
		System.out.println(emp);
		

	}

}
