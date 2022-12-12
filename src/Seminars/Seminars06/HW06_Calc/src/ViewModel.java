package Seminars.Seminars06.HW06_Calc.src;

import java.util.Scanner;

public abstract class ViewModel {
    protected Scanner in = new Scanner(System.in);
    public abstract double getValue(String title);
    public abstract int getAction(String title);
    public abstract void print(double data, String title);

}
