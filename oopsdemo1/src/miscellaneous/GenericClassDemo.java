package miscellaneous;
class Sample<T> //parameterized class/Generic clss
{
	private T data;// generic variable declaration

	public Sample(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		
		
	Sample <String> s1=new Sample<String>("Java Generics");
	System.out.println("Display from generic class by passing by String object :"+s1.getData());

	
	Sample <Integer> s2=new Sample<Integer>(200);
	System.out.println("Display from generic class by passing by Integer object :"+s2.getData());
	
	Sample <Double> s3=new Sample<Double>(555.50);
	System.out.println("Display from generic class by passing by Double object :"+s3.getData());
	}

}
