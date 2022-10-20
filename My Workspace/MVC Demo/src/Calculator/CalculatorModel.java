package Calculator;

public class CalculatorModel {

	private int calculationValue;
	
	public void addTwoNumber(int firstNumber, int secondnumber) {
		calculationValue = firstNumber + secondnumber;
	}
	
	public int getCalculationValue() {
		return calculationValue;
	}
}
