import java.util.ArrayList;
import java.util.Iterator;

public class IT {

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr.add(10);
		
		for(int i=0; i<arr.size();i++){
		System.out.println(arr.get(i));
		}
		System.out.println("--------------------------");
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(10);
		
		for(int i=0; i<arr1.size();i++){
			System.out.println(arr1.get(i));
			}
			
		arr.removeAll(arr1);
		System.out.println("--------------------------");
		for(int i=0; i<arr.size();i++){
			System.out.println(arr.get(i));
			}
		arr.addAll(arr1);
		System.out.println("--------------------------");
		for(int i=0; i<arr.size();i++){
			System.out.println(arr.get(i));
			}
			
		arr.retainAll(arr1);
		System.out.println("--------------------------");
		for(int i=0; i<arr.size();i++){
			System.out.println(arr.get(i));
			}
			
		
		System.out.println(arr.size());
		
//		ArrayList<Employee> arr = new ArrayList<Employee>();
//		Employee e1 = new Employee("Shivam", 3500, "QA");
//		Employee e2 = new Employee("Rohit", 2500, "QA");
//		Employee e3 = new Employee("amit", 300, "QA");
//		
//		arr.add(e1);
//		arr.add(e2);
//		arr.add(e3);
//		
//		Iterator<Employee> it = arr.iterator();
//		while(it.hasNext())
//		{
//			Employee emp = it.next();
//			System.out.println(emp.name);
//			System.out.println(emp.emp_code);
//			System.out.println(emp.comp);
//		}
		
		
		
	}
}
