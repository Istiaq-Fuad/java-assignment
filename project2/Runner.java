import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = scan.nextInt();

    scan.close();

    System.out.println(Easter.getEasterSundayDate(year));
  }
}
