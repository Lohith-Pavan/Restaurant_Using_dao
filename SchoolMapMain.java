package collectionPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SchoolMapMain {
    public static void main(String args[]) {
    	List<Student> list = new ArrayList<>();
    	Map<Teacher,List<Student>> school = new HashMap<>();
     Student s = new Student(1,"abc");
   	 Student s1 = new Student(2,"pavan");
   	 Student s2 = new Student(3,"dunga");
 
   	 Teacher t = new Teacher(101,"suresh");
   	 Teacher t1 = new Teacher(102,"ramesh");
   	 Teacher t2 = new Teacher(103,"yogesh");
   	 
   	 School st = new School(s,t);
   	 School st1 = new School(s1,t1);
   	 School st2 = new School(s1,t1); 
   	 school.put(t,list);
   	 school.put(t1,list);
   	 school.put(t2,list);
   	 list.add(s);
   	 list.add(s1);
   	 list.add(s2);
   	 Set<Teacher> map = school.keySet();
   	 for(Teacher x : map) {
   		  System.out.println(x +" "+school.get(x) );
   	 }
    }
}
