/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author Paul Jerchaflie
 *
 */
public class DivideOperatorFor2numbers extends OperatorFor2numbers implements Divide {

	
	public DivideOperatorFor2numbers(float number1, float number2) {
			this.number1 = number1;
			this.number2 = number2;
	}
	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(int, int)
	 */
	@Override
	public int divide(int num1, int num2) {
			return num1 / num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(float, float)
	 */
	@Override
	public float divide(float num1, float num2) {
		return num1 / num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide2numbers()
	 */
	@Override
	public float divide2numbers() {
		return number1 / number2;
	}
}
