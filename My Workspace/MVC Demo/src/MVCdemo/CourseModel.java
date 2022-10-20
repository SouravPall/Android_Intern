package MVCdemo;

public class CourseModel {

	private String CourseName;
	private int CourseID;
	private String CourseCategory;
	
	public CourseModel() {
		
	}
	
	public CourseModel(String courseName, int courseID, String courseCategory) {
		super();
		CourseName = courseName;
		CourseID = courseID;
		CourseCategory = courseCategory;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getCourseID() {
		return CourseID;
	}

	public void setCourseID(int courseID) {
		CourseID = courseID;
	}

	public String getCourseCategory() {
		return CourseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		CourseCategory = courseCategory;
	}
	
	
	
	
}
