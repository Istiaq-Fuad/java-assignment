import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Power Factor: ");
    double powerFactor = scan.nextDouble();

    scan.close();

    PowerFactory powerFactory = new PowerFactory(powerFactor);
    System.out.printf("Voltage Source: %4.3f Vrms\n", powerFactory.getVoltageSourced());
  }
}
