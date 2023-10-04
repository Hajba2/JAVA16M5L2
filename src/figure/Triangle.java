package figure;

public class Triangle extends Figure {

    private int twoSidesSize;

    public Triangle(int twoSidesSize) {
        this.twoSidesSize = twoSidesSize;
    }

    public int getTwoSidesSize() {
        return twoSidesSize;
    }


    @Override
    double getSquare() {
        return (twoSidesSize * twoSidesSize) / 2;
    }
}
