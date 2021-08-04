package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationDemo {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("James");
		names.add("Micheal");
		names.add("Andy");
		names.add("Jim");
		names.add("Robert");
		System.out.println(names);
		//iterator interface for traversing
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			names.add(3,"John");// adding element in specified index
			names.remove(0); // first element
			names.set(1,"java");// replace existing element
			System.out.println("*****Display collection for each loop******");
			
			for(String i:names)
			{
				System.out.println(i);
			}
			
			ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(222.54);
		marks.add(244.54);
		marks.add(766.64);
		marks.add(212.54);
		marks.add(555.58);
		System.out.println();
		for(Double i:marks)
		{
			System.out.println(i);
		}
		
		}

	}

}
