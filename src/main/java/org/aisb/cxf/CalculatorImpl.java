package org.aisb.cxf;

import javax.jws.WebService;

@WebService(endpointInterface = "org.aisb.cxf.Calculator")
public class CalculatorImpl implements Calculator {

    public double add(
	double firstOperand,
    double secondOperand
    ) {
	return firstOperand + secondOperand;
    }
    
    public double subtract(
	double firstOperand,
    double secondOperand
    ) {
	return firstOperand - secondOperand;
    }

}
