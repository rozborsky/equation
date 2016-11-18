package ua.rozborsky.web.classes;

import org.springframework.stereotype.Component;
import ua.rozborsky.web.ua.rozborsky.web.interfaces.Equation;
import ua.rozborsky.web.ua.rozborsky.web.interfaces.GetValues;

/**
 * Created by roman on 18.11.2016.
 */
@Component
public class EquationImpl implements Equation{
    private double a;
    private double b;
    private double c;
    private double d;
    private double x1;
    private double x2;


    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {

    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public void setB(double b) {

    }

    @Override
    public double getC() {
        return c;
    }

    @Override
    public void setC(double c) {

    }

    @Override
    public double getX1() {
        return x1;
    }

    @Override
    public double getX2() {
        return x2;
    }

    @Override
    public void setValues(GetValues getValues) {
        this.a = getValues.getA();
        this.b = getValues.getB();
        this.c = getValues.getC();
    }

    @Override
    public boolean canCalculate() {
        d = Math.pow(b, 2) - (4 * a * c);
        System.out.println(d);
        return d >= 0;
    }

    @Override
    public void calculateX() {
        x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
        if(d >= 0) {
            x2 = ((-1) * b - Math.sqrt(d)) / (2 * a);
            System.out.println(x2);
        }
    }

    @Override
    public String getValues() {
        String result = "a = " + a + "; b = " + b + "; c = " + c + "</br>";
        if(d > 0) {
            result += "x1 = " + x1 + "</br> x2 = " + x2;
        } else if (d == 0) {
            result += "x1, x2 = " + x1;
        }
        return result;
    }
}
