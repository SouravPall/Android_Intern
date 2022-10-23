package Calculator;

import javax.swing.*;

public class CalculatorView {

	JFrame f;
	private JTextField firstname = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calSolution = new JTextField(10);
	
	CalculatorView(){
		
		f = new JFrame("Calculator Example");
		
		JPanel calcPanel = new JPanel();
		f.setSize(600, 200);
		
		calcPanel.add(firstname);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calSolution);
		
		f.add(calcPanel);
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}

	public JTextField getFirstname() {
		return firstname;
	}

	public void setFirstname(JTextField firstname) {
		this.firstname = firstname;
	}

	public JLabel getAdditionLabel() {
		return additionLabel;
	}

	public void setAdditionLabel(JLabel additionLabel) {
		this.additionLabel = additionLabel;
	}

	public JTextField getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(JTextField secondNumber) {
		this.secondNumber = secondNumber;
	}

	public JButton getCalculateButton() {
		return calculateButton;
	}

	public void setCalculateButton(JButton calculateButton) {
		this.calculateButton = calculateButton;
	}

	public JTextField getCalSolution() {
		return calSolution;
	}

	public void setCalSolution(JTextField calSolution) {
		this.calSolution = calSolution;
	}
	
	
	
	
}
