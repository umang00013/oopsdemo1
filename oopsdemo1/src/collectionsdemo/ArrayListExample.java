package collectionsdemo;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//create list of books
		List <Book> bList=new ArrayList <Book>();
		
		
		
		
		//Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        
        //add books to list
        bList.add(b1);
        bList.add(b2);
        bList.add(b3);
        
        //traverse a list
        System.out.println("*******Book Details**********");
        
        for(Book i:bList)
        {
        	System.out.println(i.id+" "+i.author+" "+i.publisher+" "+i.quantity);
        }
        System.out.println("total no of books : "+bList.size());   
	}

}
