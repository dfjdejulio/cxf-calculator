package org.aisb.cxf;

import javax.jws.*;

	/**
	 *
	 * Do some math.
	 *
	 * @author Doug DeJulio
	 *
	 */
	 
@WebService
public interface Calculator {

	/**
	 *
	 * Add the two operands.
	 *
	 * @param firstOperand The first operand.
	 * @param secondOperand The... come on, you get it.
	 *
	 * @return The sum.
	 */

    double add(
    @WebParam(name="firstOperand")
    double firstOperand,
	@WebParam(name="secondOperand")
    double secondOperand
    );
    
	/**
	 *
	 * Subtract the second operand from the first.
	 *
	 * @param firstOperand The first operand.
	 * @param secondOperand Another operand.
	 *
	 * @return The difference.
	 */

    double subtract(
    @WebParam(name="firstOperand")
    double firstOperand,
    @WebParam(name="secondOperand")
    double secondOperand
    );
}
