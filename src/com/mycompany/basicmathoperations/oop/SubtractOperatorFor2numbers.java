/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author Paul Jerchaflie
 *
 */
public class SubtractOperatorFor2numbers extends OperatorFor2numbers implements Subtract {

	
	SubtractOperatorFor2numbers(float number1, float number2){
		this.number1=number1;
		this.number2=number2;
	}
	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtract#subtract(int, int)
	 */
	@Override
	public int subtract(int num1, int num2) {
		return num1-num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtract#subtract(float, float)
	 */
	@Override
	public float subtract(float num1, float num2) {
		return num1-num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtract#subtract2numbers()
	 */
	@Override
	public float subtract2numbers() {
		return number1-number2;
	}

}
