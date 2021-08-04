package oopsdemo1;
// addn of 2 time
//t1--> 12:45:55
//t2-->10:30:30
//
// t1+t2
//if sec>60 .. mins should be incremented,
//if min>60..hrs should be incremented

public class Time {
	int hrs,min,sec;
	

     Time()
    {
	hrs=min=sec=0;
    }
   Time(int h,int m, int s)
   {
	   hrs=h;
	   min=m;
	   sec=s;
	   
   }
   void add(Time obj)
   {
		
		this.hrs+= obj .hrs;
		this.min+= obj.min;
		this.sec+= obj.sec;
		
		if(sec>=60)
		{min=min+1;
		sec=sec-60;
		}
		if(min>=60)
		{
			hrs=hrs+1;
			min=min-60;
		}
	}
		void display()
		{
			System.out.println("h"+this.hrs+":m"+this.min+":s"+this.sec);
   
   
   
   
   
   
     
     
     
     
} }  
