package Seminars.Seminars06.HW06_Calc.src;

public interface Model {
    double resSum(); // сумма
    double resSub(); // вычетание
    double resMulti(); // умножение
    double resDiv(); // деление

    void setX(double value);
    void setY(double value);
    void setAction(int value);

}
