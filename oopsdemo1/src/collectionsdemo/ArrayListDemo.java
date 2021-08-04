package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		//generic arraylist
		ArrayList <String> a1=new ArrayList <String>();
		// add elements to arraylist
		a1.add("java");
		a1.add("perl");
		a1.add("C++");
		a1.add("C# 5.0");
		System.out.println(a1);
		
		// get elements by index
		
		System.out.println("element at index 1 :"+a1.get(1));
		System.out.println("does list contains element java ?" +a1.contains("java"));
		
		//add elements at specific index
		
		a1.add(2,"Oracle");
		System.out.println(a1);
		
		System.out.println("Is array list empty ? :"+a1.isEmpty());
		System.out.println("Index of perl :"+a1.indexOf("perl"));
		System.out.println("size of arraylist : "+a1.size());
		
		Collections.sort(a1);
		System.out.println("Array list after sorting :"+a1);
		//a1.add(100);------compile error
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(100);
		a2.add(500);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		System.out.println(a2);
		System.out.println("Size :"+a2.size());
	}

}
