package collectionsdemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Ruby");
        
        programmingLanguages.add("Java");
        programmingLanguages.add(null);
        programmingLanguages.add(null);
      //  Collections.sort(programmingLanguages);
        System.out.println("=== Iterate over a HashSet using iterator() ===");
        Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
        while (programmingLanguageIterator.hasNext()) {
            String programmingLanguage = programmingLanguageIterator.next();
            System.out.println(programmingLanguage);
        }
        System.out.println("=== Iterate over a HashSet using simple for-each loop ===");
        for(String programmingLanguage: programmingLanguages) {
            System.out.println(programmingLanguage);
        }
       HashSet<String> p1=new HashSet<>(programmingLanguages);
       System.out.println(p1);
       HashSet<String> clonep1=new HashSet<>(programmingLanguages);
       
        //clone the hashset
     clonep1=(HashSet)p1.clone();
     //display after cloning
     System.out.println(clonep1);
        
        
	}

}
