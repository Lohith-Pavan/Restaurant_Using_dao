package collectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
     public static void main(String args[]) {
    	 List<Student> students = new ArrayList<>();
    	 Student ob = new Student(1,"lohith");
    	 Student ob1 = new Student(2,"pavan");
    	 Student ob2 = new Student(3,"dunga");
    	 students.add(ob);
    	 students.add(ob1);
    	 students.add(ob2);
    	 for(Student x: students) {
    		 System.out.println(x);
    	 }
     }
}
