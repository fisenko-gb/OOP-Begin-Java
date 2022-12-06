public class Main {
    public static void main(String[] args) {

        Prezenter p = new Prezenter(new View(), new ScoreModel());
        p.buttonClick();
    }
}