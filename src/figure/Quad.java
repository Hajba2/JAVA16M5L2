package figure;

public class Quad extends Figure {

    private int sideSize;

    public Quad(int sideSize) {
        this.sideSize = sideSize;
    }

    public int getSideSize() {
        return sideSize;
    }

    @Override
    double getSquare() {
        return sideSize * sideSize;
    }
}
