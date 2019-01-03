package tuto;

import java.util.HashMap;
import java.util.Map;

public class mapRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(2);
		
		
		Map <Employee, String> map = new HashMap<Employee,String>();
		
		map.put(emp1," Toto");
		map.put(emp2, "Toto");
		System.out.println(map.size());  // je dirai 1  --> en fait c 2 mais pourquoi ??? 
		
		
		//////////////////////////////////
		
		int i= new Integer (1);
		int i1=1;
		Map <Integer, String> map1 = new HashMap<Integer,String>();
		map1.put(i, "un");
		map1.put(i1, "deux");  // il dit 1 
		
		System.out.println(map1.size());
		
		
		
		 

	}
}
	
	

