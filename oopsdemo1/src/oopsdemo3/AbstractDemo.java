package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Trainee t1=new Marks("John","New York",1001,50);
		
		t1.show();
		double marks=t1.calculateMarks();
		System.out.println(t1+" "+marks);
	}

}