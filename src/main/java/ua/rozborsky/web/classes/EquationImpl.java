package ua.rozborsky.web.classes;

import org.springframework.stereotype.Component;
import ua.rozborsky.web.interfaces.Equation;
import ua.rozborsky.web.interfaces.GetValues;

import javax.persistence.*;

/**
 * Created by roman on 18.11.2016.
 */
@Entity
@Table(name = "values")
@Component
public class EquationImpl implements Equation{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "a")
    private double a;

    @Column(name = "b")
    private double b;

    @Column(name = "c")
    private double c;

    @Transient
    private double d;

    @Column(name = "x1")
    private double x1;

    @Column(name = "x2")
    private double x2;


    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }
    @Override
    public double getB() {
        return b;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getC() {
        return c;
    }

    @Override
    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getX1() {
        return x1;
    }

    @Override
    public void setX1(double x1) {
        this.x1 = x1;
    }

    @Override
    public double getX2() {
        return x2;
    }

    @Override
    public void setX2(double x2) {
        this.x2 = x2;
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

        return d >= 0;
    }

    @Override
    public void calculateX() {
        x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
        if(d >= 0) {
            x2 = ((-1) * b - Math.sqrt(d)) / (2 * a);
        }
    }

    @Override
    public String getValues() {
        String result = "a = " + a + "; b = " + b + "; c = " + c + "</br>";
        if(d > 0) {
            result += "x1 = " + x1  + "</br> x2 = " +  x2;
        } else if (d == 0) {
            result += "x1, x2 = " + x1;
        }
        return result;
    }
}
