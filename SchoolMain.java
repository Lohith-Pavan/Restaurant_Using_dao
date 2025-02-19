package collectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class SchoolMain {
     public static void main(String args[]) {
    	 List<School> school = new ArrayList<>();
    	 Student s = new Student(1,"lohith");
    	 Student s1 = new Student(2,"pavan");
    	 Student s2 = new Student(3,"dunga");
  
    	 Teacher t = new Teacher(101,"suresh");
    	 Teacher t1 = new Teacher(102,"ramesh");
    	 Teacher t2 = new Teacher(103,"yogesh");
    	 
    	 School st = new School(s,t);
    	 School st1 = new School(s1,t1);
    	 School st2 = new School(s1,t1); 
    	 school.add(st);
    	 school.add(st1);
    	 school.add(st2);
//    	 for(School x : school) {
//    		 System.out.println(x);
//    	 }
     }
}
