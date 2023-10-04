package figure;

public class Rectange extends Figure {

    private int firstSide;
    private int secondSide;

    public Rectange(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    double getSquare() {
        return firstSide * secondSide;
    }
}
