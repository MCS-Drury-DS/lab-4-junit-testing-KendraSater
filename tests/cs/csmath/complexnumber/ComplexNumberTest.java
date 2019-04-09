package cs.csmath.complexnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {

    private final double LIMIT = 0.0000001;

    @Test
    public void add() {
        ComplexNumber cn = new ComplexNumber(6,4.8);
        ComplexNumber cn2 = new ComplexNumber(2,3.4);
        cn.add(cn2);
        assertEquals(cn.getRealPart(), 8,  LIMIT);
        assertEquals(cn.getImagPart(), 8.2,  LIMIT);
    }

    @Test
    public void sub() {
        ComplexNumber cn = new ComplexNumber(7,-4.5);
        ComplexNumber cn2 = new ComplexNumber(4,0);
        cn.sub(cn2);
        assertEquals(cn.getRealPart(),3 , LIMIT);
        assertEquals(cn.getImagPart(),-4.5 , LIMIT);
    }

    @Test//case 1
    public void mult() {
        ComplexNumber cn = new ComplexNumber(6.0,2.5);
        ComplexNumber cn2 = new ComplexNumber(4.0,3.0);
        cn.mult(cn2);
        assertEquals(cn.getRealPart(), 16.5 , LIMIT );
        assertEquals(cn.getImagPart(), 28 , LIMIT );
    }

    @Test//case 2
    public void mult_1() {
        ComplexNumber cn = new ComplexNumber(4.0,1.5);
        ComplexNumber cn2 = new ComplexNumber(3.0,2.0);
        cn.mult(cn2);
        assertEquals(cn.getRealPart(), 9.0, LIMIT );
        assertEquals(cn.getImagPart(), 12.5 , LIMIT );
    }

    @Test//case 3
    public void mult_2() {
        ComplexNumber cn = new ComplexNumber(8.0,5.5);
        ComplexNumber cn2 = new ComplexNumber(0.0,0.0);
        cn.mult(cn2);
        assertEquals(cn.getRealPart(), 0.0, LIMIT );
        assertEquals(cn.getImagPart(), 0.0, LIMIT );
    }

    @Test
    public void div() {
        ComplexNumber cn = new ComplexNumber(5, 3);
        ComplexNumber cn2 = new ComplexNumber(3,4);
        cn.div(cn2);
        assertEquals(cn.getRealPart(), 1.08, LIMIT);
        assertEquals(cn.getImagPart(), -0.44, LIMIT);
    }

    @Test
    public void conj() {
        ComplexNumber cn = new ComplexNumber(7, -5.8);

    }

    @Test
    public void abs() {
        ComplexNumber cn = new ComplexNumber( 5, 4);

    }

    @Test
    public void getRealPart() {
        ComplexNumber cn = new ComplexNumber( 5, -2);
        assertEquals(cn.getRealPart(), 5, LIMIT );
    }

    @Test
    public void getImagPart() {
        ComplexNumber cn = new ComplexNumber(1.7, -4.3);
        double imagPart = cn.getImagPart();
        assertEquals(-4.3, imagPart, LIMIT);
    }

    @Test
    public void setReaLPart() {
        ComplexNumber cn = new ComplexNumber(8, -3.1);
        cn.setRealPart(3);
        assertEquals(3, cn.getRealPart(), LIMIT);
    }

    @Test
    public void setImagPart() {
        ComplexNumber cn = new ComplexNumber(8, 2);
        cn.setImagPart(-9.5);
        assertEquals(-9.5, cn.getImagPart(), LIMIT);
    }
}