package ua.rozborsky.web.classes;

import org.springframework.stereotype.Component;
import ua.rozborsky.web.ua.rozborsky.web.interfaces.GetValues;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 * Created by roman on 18.11.2016.
 */
@Component
public class GetValuesImpl implements GetValues {
    @NotNull(message="введите значение")
    @Digits(integer=5, fraction=2, message="целая часть не более 5-и знаков,дробная - не более 2х")
    private double a;

    @NotNull(message="введите значение")
    @Digits(integer=5, fraction=2, message="целая часть не более 5-и знаков,дробная - не более 2х")
    private double b;

    @NotNull(message="введите значение")
    @Digits(integer=5, fraction=2, message="целая часть не более 5-и знаков,дробная - не более 2х")
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
