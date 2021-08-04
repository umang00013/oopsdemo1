package cc;

import java.util.ArrayList;

public class OnStudents {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(101,76,"mike","ece");
		Student s2=new Student(102,31,"root","CSE");
		Student s3=new Student(103,42,"hussy","IS");
		Student s4=new Student(104,33,"jonny","EEE");
		Student s5=new Student(105,54,"roy","MECH");
		
		//Adding objects to DB
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println("Added objects are ");
		for(Student s:al)
		{
			System.out.println(s);
		}
		
		
		//searching objects from DB
		for(Student s:al)
		{
			if(s.name=="roy")
			{
				System.out.println(s.name+" is found");
			}
		}
		
		//finding failed students
		System.out.println("failed student(s) are");
		for(Student s:al)
		{
			if(s.marks<40)
			{
				System.out.println(s);
			}
		}
		//removing objects from DB
		
				System.out.println(al.remove(2)+"  is removed");

}
}
