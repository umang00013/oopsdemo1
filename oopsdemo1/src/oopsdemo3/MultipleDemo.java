package oopsdemo3;
//implement inheritence

class Result extends Candidate implements Exam
{

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		
	}

	@Override
	public void precent_cal() {
		int total=(mark1+mark2);
        float percent=total*100/200;
        System.out.println ("Percentage: "+percent+"%");
		
	}
	void display()
    {
        super.display();
    }
	
}

public class MultipleDemo {

	public static void main(String[] args) {
		Result r1=new Result("John",101,92,85);
		r1.display();
		r1.precent_cal();
		
	}

}
