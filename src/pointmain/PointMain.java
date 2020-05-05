package pointmain;

public class PointMain {
    public static void main(String[] args) {      
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);
        
        System.out.println("Anzahl der Pointer-Objekte = " + Point.pointCounter);
        
        Point.resetPointCounter();
        
        System.out.println("Anzahl der Pointer-Objekte = " + Point.pointCounter);
        
    }
}
