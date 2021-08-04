package mapdemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String,String> fileExtensions= new TreeMap<String,String>();
		// Adding new key-value pairs to a TreeMap
        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");
        
        //tree map will be sorted based on keys
        System.out.println(fileExtensions);
        
        TreeMap<String,String> fileExtensions1= new TreeMap<String,String>(Comparator.reverseOrder());
		// Adding new key-value pairs to a TreeMap
        fileExtensions1.put("python", ".py");
        fileExtensions1.put("c++", ".cpp");
        fileExtensions1.put("kotlin", ".kt");
        fileExtensions1.put("golang", ".go");
        fileExtensions1.put("java", ".java");
        System.out.println(fileExtensions1);
	}

}
