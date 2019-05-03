package cs.csmath.complexnumber;

import cs.csmath.execptions.ComplexNumberDivisionByZeroExecption;

public class ComplexNumber {

    private double realPart;
    private double imagPart;


    //------- Constructors -------/
    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    public ComplexNumber() {
        this(0.0, 0.0);
    }

    //-------Factoring Methods-----/
    public void add(ComplexNumber otherCN) {
        this.realPart += otherCN.realPart;
        this.imagPart += otherCN.imagPart;
    }

    public void sub(ComplexNumber otherCN) {
        this.realPart -= otherCN.realPart;
        this.imagPart -= otherCN.imagPart;
    }

    public void mult(ComplexNumber otherCN) {
        double newReal = (this.realPart * otherCN.getRealPart()) - (this.imagPart * otherCN.getImagPart());
        double newImag = (this.imagPart * otherCN.getRealPart()) + (this.realPart * otherCN.getImagPart());
        this.realPart = newReal;
        this.imagPart = newImag;
    }

    public void div(ComplexNumber otherCN) {
        double divisor = otherCN.getRealPart() * otherCN.getRealPart() + otherCN.getImagPart() * otherCN.getImagPart();
        if (divisor == 0.0) {
            throw new ComplexNumberDivisionByZeroExecption();
        }
        double realSave = this.realPart;
        this.realPart = (this.realPart * otherCN.getRealPart() + this.getImagPart() * otherCN.getImagPart()) / divisor;
        this.imagPart = (this.getImagPart() * otherCN.getRealPart() - realSave * otherCN.getImagPart()) / divisor;
    }

    public ComplexNumber conj() {
        return new ComplexNumber(this.realPart, -1 * this.imagPart);
    }

    public double abs() {
        return Math.sqrt(this.realPart * this.realPart + this.imagPart * this.imagPart);
    }

    public String toString() {
        String val = "" + this.realPart + " + " + this.imagPart + "i";
        return val;
    }

    //-------Assignment------/
    public static ComplexNumber add(ComplexNumber firstCN, ComplexNumber secondCN) {
        double newReal = firstCN.getRealPart();
        double newImag = firstCN.getImagPart();
        ComplexNumber newCN = new ComplexNumber(newReal, newImag);
        newCN.add(secondCN);
        return newCN;
    }

    public static ComplexNumber sub(ComplexNumber firstCN, ComplexNumber secondCN) {
        double newReal = firstCN.getRealPart();
        double newImag = firstCN.getImagPart();
        ComplexNumber newCN = new ComplexNumber(newReal, newImag);
        newCN.sub(secondCN);
        return newCN;
    }

    public static ComplexNumber mult(ComplexNumber firstCN, ComplexNumber secondCN) {
        double newReal = firstCN.getRealPart();
        double newImag = firstCN.getImagPart();
        ComplexNumber newCN = new ComplexNumber(newReal, newImag);
        newCN.mult(secondCN);
        return newCN;
    }

    public static ComplexNumber div(ComplexNumber firstCN, ComplexNumber secondCN) {
        double newReal = firstCN.getRealPart();
        double newImag = firstCN.getImagPart();
        ComplexNumber newCN = new ComplexNumber(newReal, newImag);
        newCN.div(secondCN);
        return newCN;
    }


    //-------- Getters & Setterd -----/
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart =realPart;
    }

    public void setImagPart(double imagPart) {
        this.imagPart = imagPart;
    }

    public double getImagPart() {
        return imagPart;
    }

     /*public static void main (String [] args){
        ComplexNumber cn1 = new ComplexNumber (2, 3.5);
        System.out.println("Print the value of cn1: 2 + 3.5i");
        System.out.println("real: " + cn1.getRealPart());
        System.out.println("imag: " + cn1.getImagPart());

        ComplexNumber cn5 = new ComplexNumber( 2, 2);
        ComplexNumber cn6 = new ComplexNumber( 2, 2);
        cn5.div(cn6);
        System.out.println("real: " + cn5.getRealPart());
        System.out.println("imag: " + cn5.getImagPart());


         ComplexNumber cn2 = new ComplexNumber (4.0, 1.3);
        System.out.println("The sum of cn1 and cn2 is: 6.0 + 4.8i");
        cn1.add(cn2);
        System.out.println("real: " + cn1.getRealPart());
        System.out.println("imag: " + cn1.getImagPart());

        System.out.println("toString Test: " + cn1);

        System.out.println("Mult test: (4.31 - 0.1i) ");
        ComplexNumber cn3 = new ComplexNumber(2.0, 2.1);
        ComplexNumber cn4 = new ComplexNumber(1.0, -1.1);
        cn3.mult(cn4);
        System.out.println("mult test: " + cn3);


        System.out.println("Div test: (0.75 + 0.25i)");
        ComplexNumber cn7 = new ComplexNumber(1, 2);
        ComplexNumber cn8 = new ComplexNumber(2,2);
        cn7.div(cn8);
        System.out.println("Division test: " + cn1);

        ComplexNumber cn9 = new ComplexNumber();
        try {
            cn8.div(cn9);
        }
        catch(ComplexNumberDivisionByZeroExecption e){
            System.out.println(e.getMessage());
        }
        System.out.println("Division test: " + cn8);
    }*/
}
