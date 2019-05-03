package cs.csmath.execptions;

import cs.csmath.complexnumber.ComplexNumber;

public class ComplexNumberDivisionByZeroExecption extends RuntimeException {
    public ComplexNumberDivisionByZeroExecption(){
        super("Attempt to divide a complex number by zero ");
    }
}
