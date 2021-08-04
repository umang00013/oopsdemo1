package collectionsdemo;
//comparable interface is used to sort user defined objects based on single field
public class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if(age==o.age)
		return 0;
		else if(age>o.age) // elae if return -1   and else return 0----des order
			return 1;
		else
			return -1;
	}

}
