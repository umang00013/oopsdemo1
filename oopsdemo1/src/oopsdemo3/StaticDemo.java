package oopsdemo3;
class Count{//inst class
	static int cnt;// st var
	int a;//ins var
	Count()
	{
	cnt+=1;	
	a=100;
	}
	static void display()//static method
	{
		System.out.println("no of objects created :"+cnt);
	}
	void print()
	{
		System.out.println("Instance method");
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		//c1.display();
		c1.print();
		c2.print();
		c3.print();
		Count.display();//invoke st method
		
		
	}

}
