package mapdemo;

import java.util.Map;
import java.util.TreeMap;

public class AccessTreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(1003, "Rajeev");
        employees.put(1001, "James");
        employees.put(1002, "Sachin");
        employees.put(1004, "Chris");

        System.out.println("Employees map : " + employees);

        // Finding the size of a TreeMap
        System.out.println("Total number of employees : " + employees.size());

        // Check if a given key exists in a TreeMap
        Integer id = 1004;
        if(employees.containsKey(id)) {
            // Get the value associated with a given key in a TreeMap
            String name = employees.get(id);
            System.out.println("Employee with id " + id + " : " + name);
        } else {
            System.out.println("Employee does not exist with id : " + id);
        }

        // Find the first and last entry
        System.out.println("First entry in employees map : " + employees.firstEntry());
        System.out.println("Last entry in employees map : " + employees.lastEntry());

        // Find the entry whose key is just less than the given key
        Map.Entry<Integer, String> employeeJustBelow = employees.lowerEntry(1002);
        System.out.println("Employee just below id 1002 : " + employeeJustBelow);

        // Find the entry whose key is just higher than the given key
        Map.Entry<Integer, String> employeeJustAbove = employees.higherEntry(1002);
        System.out.println("Employee just above id 1002 : " + employeeJustAbove);
        employees.remove(1003);
       //display contents of treemap using for each loop 
        
        for(Map.Entry<Integer, String> m:employees.entrySet())
        {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
        
        
        
        
        
        
        
        
        
        
	}
}