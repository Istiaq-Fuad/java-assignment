public class Runner {
  public static void main(String[] args) {
    Triangle mytTriangle = new Triangle(2, 3, 5, 4, 3, 7);

    System.out.println("Perimeter of the Triangle: " + mytTriangle.getPerimeter());

    System.out.println("Length of side A: " + mytTriangle.getALength());
    System.out.println("Length of side B: " + mytTriangle.getBLength());
    System.out.println("Length of side C: " + mytTriangle.getCLength());

    System.out.println("Angle of a: " + mytTriangle.getAngleA());
    System.out.println("Angle of b: " + mytTriangle.getAngleB());
    System.out.println("Angle of c: " + mytTriangle.getAngleC());
  }
}
