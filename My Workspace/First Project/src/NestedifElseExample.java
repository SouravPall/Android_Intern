
public class NestedifElseExample {
	
	public static void main(String[] args) {
		
		int age = 20;
		int weight = 70;
		
		if(age> 18) {
			if(weight> 60) {
				System.out.println("You are eligble");
			}
		}
		else {
			System.out.println("You are not eligble");
		}
	}
}
