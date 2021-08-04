package oopsdemo3;

public class ShapeTest {

	public static void main(String[] args) {
		
		//programming for interfaces not implementation
		Shape shape=new Circle(10);
		System.out.println("Using interface :"+shape.LABLE);
		shape.draw();
		System.out.println("Area of circle with radius is :" +shape.getArea());
		
		//switching from one implementation to another easily
		shape=new Rectangle(10,7);
		shape.draw();
		System.out.println("Area of rectangle :"+shape.getArea());
	}

}
