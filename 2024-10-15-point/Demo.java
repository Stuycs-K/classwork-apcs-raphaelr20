public class Demo{

  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
  }


  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println( distance(p2,p3));
    System.out.println( Point.distance(p2,p3));
    System.out.println( p2.distanceTo(p3));
    System.out.println( distance(p1,p3));
    System.out.println( Point.distance(p1,p3));
    System.out.println( p1.distanceTo(p3));
    Point p4 = new Point(0,0);
    Point p5 = new Point(2,0);
    Point p6 = new Point(1,Math.sqrt(3));
    System.out.println( distance(p4,p5));
    System.out.println( distance(p5,p6));
    System.out.println( distance(p4,p6));
  }
}
