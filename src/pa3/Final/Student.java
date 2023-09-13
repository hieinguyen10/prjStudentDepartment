package pa3.Final;

public class Student {

	private String id;
	private String name;
	private Transcript transcript;
	
	public Student(String id, String name, Transcript transcript) {
		
		this.id = id;
		this.name = name;
		this.transcript = transcript;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	
	public void addPrevCourse(String courseId, int grade) {
		if(transcript.getPrevCourses().containsKey(courseId)) {
			System.out.println("PrevCourse already exists");
		}
		else {
			
			if(grade<0) {
				grade = 0;
			}
			transcript.getPrevCourses().put(courseId, grade);
		}
	}
	public void editPrevCourse(String courseId, int grade) {
		if(!transcript.getPrevCourses().containsKey(courseId)) {
			System.out.println("PrevCourse does not exists");
		}
		else {
			
			if(grade<0) {
				grade = 0;
			}
			transcript.getPrevCourses().replace(courseId, grade);
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", transcript=" + transcript + "]";
	}
	
	
	
}
