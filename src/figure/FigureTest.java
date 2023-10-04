package figure;

public class FigureTest {

    public static void main(String[] args) {
        Rectange r1 = new Rectange(2, 5);
        Rectange r2 = new Rectange(3, 6);
        Rectange r3 = new Rectange(5, 6);
        Quad q1 = new Quad(4);
        Quad q2 = new Quad(6);
        Quad q3 = new Quad(7);
        Triangle t1 = new Triangle(3);
        Triangle t2 = new Triangle(4);
        Triangle t3 = new Triangle(5);

//        Quad[] qArr = {q1, q2, q3};
//        Rectange[] rArr = {r1, r2, r3};


        Figure[] fArr = {q1, q2, q3, r1, r2, r3, t1, t2, t3};
        for (Figure f : fArr) {
            System.out.println("f.getSquare() = " + f.getSquare());
        }


//        for (Quad q : qArr) {
//            System.out.println("q.getSquare() = " + q.getSquare());
//        }
//
//        for (Rectange r : rArr) {
//            System.out.println("r.getSquare() = " + r.getSquare());
//        }


    }
}
