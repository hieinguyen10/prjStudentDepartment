package pa3.Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;



public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department department = new Department();
		
		HashMap<String,Course> setOfCourses = new HashMap<String,Course>();

		try {
	           
			File courses = new File("courses_f22.txt"); // use path
	        Scanner myReader = new Scanner(courses);
	        while (myReader.hasNextLine()) {
	        	String line  = myReader.nextLine();
	            //System.out.println(line);
	            String[] courseArr = line.split(": ");
	            
	            
	            HashSet<String> prerequisites = new HashSet<String>();
	            if(courseArr[4]=="none") {
	            	prerequisites.add(courseArr[4]);
	            }
	            
	            else{
	            	for (String element: (courseArr[4].split(", "))) {
	            
	            	   prerequisites.add(element);
	               }
	            }
	            Course course = new Course(courseArr[0],courseArr[1], courseArr[2], Integer.parseInt(courseArr[3]), prerequisites, Short.parseShort(courseArr[5]));
	            setOfCourses.put(courseArr[0], course);
	            
	        }
	        myReader.close();
		} catch (FileNotFoundException e) {
	       	System.out.println("An error occurred.");
	        e.printStackTrace();
		}
		
		department.setCourseMap(setOfCourses);
		
		System.out.println(department.getCourseMap());
	}

}
