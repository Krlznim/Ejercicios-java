import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer número entero: ");
    int num1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número entero: ");
    int num2 = scanner.nextInt();

    int suma = num1 + num2;
    
    System.out.println("El resultado de la suma es: "+ suma);

   }
}
