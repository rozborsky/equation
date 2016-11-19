package ua.rozborsky.web.interfaces;


/**
 * Created by roman on 18.11.2016.
 */
public interface Equation {

    void setId(int id);

    int getId();

    double getA();

    void setA(double a);

    double getB();

    void setB(double b);

    double getC();

    void setC(double c);

    double getX1();

    void setX1(double x1);

    double getX2();

    void setX2(double x2);

    void setValues(GetValues getValues);

    boolean canCalculate();

    void calculateX();

    String getValues();
}
