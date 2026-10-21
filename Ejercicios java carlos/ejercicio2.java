import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese los kilómetros: ");
    double kil = scanner.nextDouble();
    double metros = kil * 1000;
    System.out.println("Metro igual a kilómetros: " + metros);
    double cm = kil * 100000;
    System.out.println("metro igual a kilómetros: " + cm);

   }
}
