package Seminars.Seminars06.HW06_Calc.src;

public class View extends ViewModel{
    @Override
    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }
    @Override
    public int getAction(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }
    @Override
    public void print(double data, String title) {
        System.out.printf(title + data + "\n");
    }
}
