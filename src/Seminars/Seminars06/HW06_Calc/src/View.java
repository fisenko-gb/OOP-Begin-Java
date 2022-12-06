import java.util.Scanner;

public class View {
    private Scanner in = new Scanner(System.in);
    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }
    public int getAction(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }
    public void print(double data, String title) {
        System.out.printf(title + data + "\n");
    }
}
