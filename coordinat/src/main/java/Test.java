import java.util.ArrayList;
import java.util.List;

public class Test {
    Point point1 = new Point();
    Point point2 = new Point(5, 10.5);

    double sonuc1 = getDistance(point1,point2);

    public double getDistance(Point point1, Point point2) {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        //işlemler
        //işlemlerin sonucunu return ile döndür (0 yerine sonucu yaz)
        return 0;
    }

}
