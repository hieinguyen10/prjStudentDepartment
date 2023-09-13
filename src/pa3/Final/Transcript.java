package pa3.Final;

import java.util.*;

public class Transcript {

	private HashMap<String, Integer> prevCourses;
	private int grade = -1;
	
	public Transcript() {
		
	}


	public HashMap<String, Integer> getPrevCourses() {
		return prevCourses;
	}

	public void setPrevCourses(HashMap<String, Integer> prevCourses) {
		prevCourses = prevCourses;
	}
	
	public void displayPrevCourse() {
		for(String courseId: prevCourses.keySet()) {
			System.out.println(courseId);
		}
	}
	
	public void displayGrades() {
	
		System.out.println(prevCourses);
	}
}


