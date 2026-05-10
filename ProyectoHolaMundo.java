
import java.util.Scanner;

public class ProyectoHolaMundo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hola Mundo");
            System.out.println("Bienvenidos a Java");
            System.out.println("Y a Git/GitHub");
            
            System.out.println("-------------------");
            System.out.println("Ingresar el primer numero");
            double num1=scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            
            double suma =num1+num2;
            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        }
    }
    
}
