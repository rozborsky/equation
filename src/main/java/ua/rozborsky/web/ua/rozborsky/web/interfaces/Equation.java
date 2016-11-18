package ua.rozborsky.web.ua.rozborsky.web.interfaces;

import java.math.BigDecimal;

/**
 * Created by roman on 18.11.2016.
 */
public interface Equation {

    double getA();

    void setA(double a);

    double getB();

    void setB(double b);

    double getC();

    void setC(double c);

    double getX2();

    double getX1();

    void setValues(GetValues getValues);

    boolean canCalculate();

    void calculateX();

    String getValues();
}
