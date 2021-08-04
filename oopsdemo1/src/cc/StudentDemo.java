package cc;


import java.util.*;

public class StudentDemo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(101,90,"mike","ECE");
		Student s2=new Student(102,71,"mike","CSE");
		Student s3=new Student(103,52,"mike","IS");
		Student s4=new Student(104,63,"mike","EEE");
		Student s5=new Student(105,54,"mike","MECH");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		Collections.sort(al);
		for(Student s:al)
		{
		System.out.println(s);
		}
}

}