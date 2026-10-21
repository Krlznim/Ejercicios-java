import java.util.Scanner;

class Calculadora {
    
    public void suma(float num1, float num2) {
        float resultado = num1 + num2;
        System.out.printf("%.1f%n", resultado);
    }

    public void producto(float num1, float num2) {
        float resultado = num1 * num2;
        System.out.printf("%.1f%n", resultado);
    }
}

public class Reto0 {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Reto0 reto = new Reto0();
        reto.run();
    }

    public void run() {
        Calculadora calculadora = new Calculadora();

        while (scanner.hasNextFloat()) {
            float num1 = scanner.nextFloat();
            if (scanner.hasNextFloat()) {
                float num2 = scanner.nextFloat();
                calculadora.suma(num1, num2);
                calculadora.producto(num1, num2);
            }
        }
    }
}
