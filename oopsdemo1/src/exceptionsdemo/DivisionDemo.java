package exceptionsdemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		int a, b, result;  
        Scanner input = new Scanner(System.in);
         System.out.println("Input two integers");
         a = input.nextInt();
         b = input.nextInt();  
         
       
        try {
        	   result = a / b;  
             System.out.println("Result = " + result);
        }
        catch(ArithmeticException e) //exception throw handled in catch block
        {
        	System.out.println("Divide by Zero Error");
        	System.out.println("Exception Description :"+e.getMessage());
        	System.out.println("Exception name and Description :"+e.toString());
        	e.printStackTrace();//gives details about exception name,desc,line no of 
        	//code which generated exception
        }
        finally //clean-up operation
        {
        	input.close();
        	System.out.println("In finally block-program execution ended");
        }
}}
