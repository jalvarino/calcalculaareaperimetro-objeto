import java.io.EOFException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        mainmenu();
    }

    static void mainmenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("BIENVENIDO A LA CALCULADORA DE AREAS Y PERIMETROS");
            System.out.println("MENU");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triangulo");
            System.out.println("4. Rectangulo");
            System.out.println("5. Pentagono");
            System.out.println("6. Ver resultados anteriores");
            System.out.println("7. Salir");
            System.out.print("\nOPCION: ");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    Circulo.circulo(scanner);
                    break;
                case 2:
                    Cuadrado.cuadrado(scanner);
                    break;
                case 3:
                    Triangulo.triangulo(scanner);
                    break;
                case 4:
                    Rectangulo.rectangulo(scanner);
                    break;
                case 5:
                    Pentagono.pentagono(scanner);
                    break;
                case 6:
                    Resultados.verresultados();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("ERR::Opcion invalida");
            }
        } while (opcion != 7);
    }
}