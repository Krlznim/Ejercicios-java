import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        float num1 = scanner.nextFloat();

        System.out.print("Ingresa el segundo numero: ");
        float num2 = scanner.nextFloat();

        float suma = num1 + num2;
        float producto = num1 * num2;

        System.out.println("-------------------");
        System.out.printf("La suma es: %.1f\n", suma);
        System.out.printf("El producto es: %.1f\n", producto);

        scanner.close();
    }
}