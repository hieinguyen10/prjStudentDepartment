package pa3.Final;

import java.util.HashSet;

public class Course {
	private String id;
	private String title;
	private String discipline;
	private int numberOfHours;
	private short numberOfGroups = 0;
	private HashSet<String> prerequisites;
	
	
	public Course(String id, String title, String discipline, int numberOfHours, HashSet prerequisites, short numberOfGroups) {
		this.id = id;
		this.title = title;
		this.discipline = discipline;
		this.numberOfHours = numberOfHours;
		this.prerequisites = prerequisites;
		this.numberOfGroups = numberOfGroups;
	}
	
	public Course(Course course) {
		this.id = course.id;
		this.title = course.title;
		this.discipline = course.discipline;
		this.numberOfHours = course.numberOfHours;
		this.numberOfGroups = course.numberOfGroups;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	public int getNumberOfHours() {
		return numberOfHours;
	}
	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	public short getNumberOfGroups() {
		return numberOfGroups;
	}
	public void setNumberOfGroups(short numberOfGroups) {
		this.numberOfGroups = numberOfGroups;
	}
	
	
	public HashSet<String> getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(HashSet<String> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public void addPrerequisite(String courseId) {
		
	}
	public void deletePrerequisite() {
		
	}
	public void displayPrerequisite() {
		
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", discipline=" + discipline + ", numberOfHours="
				+ numberOfHours + ", numberOfGroups=" + numberOfGroups + ", prerequisites=" + prerequisites + "]";
	}

	
	
	
	
	
	
}
