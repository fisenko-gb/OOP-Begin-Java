public class ScoreModel extends CalcModel {

    @Override
    public double resSub() {
        return x - y;
    }
    @Override
    public double resMulti() {
        return x * y;
    }
    @Override
    public double resDiv() {
        if(y != 0){
            return x / y;
        }else{
            return -1.1234567890987654321;
        }
    }
    @Override
    public double resSum() {
        return x + y;
    }
    @Override
    public void setX(double value) {
        super.x = value;
    }
    @Override
    public void setY(double value) {
        super.y = value;
    }
    @Override
    public void setAction(int value) {
        super.act = value;
    }
}
