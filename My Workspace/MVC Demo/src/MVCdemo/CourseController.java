package MVCdemo;

public class CourseController {

	private CourseModel cModel;
	private CourseView cView;
	
	
	public CourseController(CourseModel cModel, CourseView cView) {
		super();
		this.cModel = cModel;
		this.cView = cView;
	}
	
	
	
	public void setCourseName(String name) {
		cModel.setCourseName(name);
	}
	
	public void setCourseID(int id) {
		cModel.setCourseID(id);
	}
	public void setCourseCategory(String category) {
		cModel.setCourseCategory(category);
	}
	
	
	
	public String CourseName() {
		return cModel.getCourseName();
	}
	
	public int CourseID() {
		return cModel.getCourseID();
	}
	public String CourseCategory() {
		return cModel.getCourseCategory();
	}
	
	
	
	public void updateView() {
		
		cView.CourseDetails(cModel.getCourseName(), cModel.getCourseID(), cModel.getCourseCategory()); 
	}
	
	
	
	
}
