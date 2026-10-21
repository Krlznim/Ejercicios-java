import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {

    Scanner entrada = new Scanner(System.in);

    double x1 = 0;
    double y1 = 0;
    double x2 = 0;
    double y2 = 0;
    
     System.out.print("Ingrese la distancia x1: ");
    x1 = entrada.nextDouble();
     System.out.print("Ingrese la distancia x2: ");
    x2 = entrada.nextDouble();
     System.out.print("Ingrese la distancia y1: ");
    y1 = entrada.nextDouble();
     System.out.print("Ingrese la distancia y2: ");
    y2 = entrada.nextDouble();
    
    double distancia = Math.hypot(y2 - y1, x2 - x1);
    System.out.print("El resultado de ambos puntos es: " + distancia);
    
    entrada.close();
    }
}