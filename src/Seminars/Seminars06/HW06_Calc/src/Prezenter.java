package Seminars.Seminars06.HW06_Calc.src;
public class Prezenter {
    private View view;
    private Model model;

    public Prezenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void buttonClick(){
        double rez;
        String answer = "Result: ";
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        int act = view.getAction("""
                Action:
                1 +
                2 -
                3 *
                4 /
                enter the action number:  """);
        model.setX(a);
        model.setY(b);
        model.setAction(act);
        if(act == 1){
            rez = model.resSum();
        }else if (act == 2) {
            rez = model.resSub();
        }else if (act == 3) {
            rez = model.resMulti();
        }else if (act == 4) {
            rez = model.resDiv();
            if(rez == -1.1234567890987654321){
                answer = "Error division by zero!!!";
                rez = 0;
            }
        }else {
            rez = 0;
            answer = "Action selection error!!!";
        }

        view.print(rez, answer);
    }
}
