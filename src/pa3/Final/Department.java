package pa3.Final;

import java.util.*;

public class Department {
	private HashMap<String,Course> courseMap;
	//private MyPriorityQueue<Professor> listOfProfs; // List
	
	public Department() {
		this.courseMap = new HashMap<String, Course>();
		
	}

	public Map<String, Course> getCourseMap() {
		return courseMap;
	}

	public void setCourseMap(HashMap<String, Course> courseMap) {
		this.courseMap = courseMap;
	}
	
	public boolean registerCourse(Student student, String courseId) {
		
		if (!courseMap.containsKey(courseId)) {
			System.out.println("No course");
			return false;
		}
		HashSet prerequisiteCourse = courseMap.get(courseId).getPrerequisites();
		if(prerequisiteCourse.contains("none")) {
			
			System.out.println("Success");
			return true;
		}
		else {
			if(student.getTranscript().getPrevCourses().containsKey(prerequisiteCourse)) {
				System.out.println("Success");
				return true;
			}
			return false;
		}
	}

	@Override
	public String toString() {
		return "Department [courseMap=" + courseMap + "]";
	}



	

	


}
