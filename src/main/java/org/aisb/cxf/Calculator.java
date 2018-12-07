package org.aisb.cxf;

import javax.jws.*;

@WebService
public interface Calculator {

    double add(
    @WebParam(name="firstOperand")
    double firstOperand,
	@WebParam(name="secondOperand")
    double secondOperand
    );
    
    double subtract(
    @WebParam(name="firstOperand")
    double firstOperand,
    @WebParam(name="secondOperand")
    double secondOperand
    );
}
