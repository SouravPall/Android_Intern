package OOP;

public class TestOverload {

	public static void main(String[] args) {
		
		OverloadingCalculator oCalculator = new OverloadingCalculator();
		
		System.out.println(oCalculator.doAddition(4, 5));
		System.out.println(oCalculator.doAddition(3, 5, 10));
		System.out.println(oCalculator.doAddition(1.2, 2.3));
		oCalculator.display(3, 7.3);
		oCalculator.disp(2, 3, 6.0, 10.25);
	}
}
