/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author Paul Jerchaflie
 *
 */
public class AddOperatorFor2numbers extends OperatorFor2numbers implements Add {

	
	public AddOperatorFor2numbers(float number1, float number2) {
		this.number1 = number1;
		this.number2 = number2;
}
	
	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Add#add(int, int)
	 */
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Add#add(float, float)
	 */
	@Override
	public float add(float num1, float num2) {
		return num1+num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Add#add2numbers()
	 */
	@Override
	public float add2numbers() {
		return number1+number2;
	}

}
