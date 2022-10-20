package MVCdemo;

public class MVCDemo {

	public static void main(String[] args) {
		
		CourseModel cModel = retriveDataFromDatabase();
		CourseView cView = new CourseView();
		
		CourseController controller = new CourseController(cModel, cView);
		controller.updateView();
		
		controller.setCourseName("ASP.Net");
		controller.updateView();
		
	}
	
	
	static CourseModel retriveDataFromDatabase() {
		
		CourseModel cModel = new CourseModel();
		cModel.setCourseName("Mastering Java");
		cModel.setCourseID(101);
		cModel.setCourseCategory("Programming");
		return cModel;
	}
}
