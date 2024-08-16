import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangulo {

    public static void rectangulo(Scanner args) {
        operacionesrectangulo();
    }

    private static void operacionesrectangulo() {
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do {
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el rectangulo");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. Regresar al menú principal");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    arearectangulo(scanner);
                    break;
                case 2:
                    perimetrorectangulo(scanner);
                    break;
                case 3:
                    Main.mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        } while (opcion != 3);

    }

    private static void arearectangulo(Scanner scanner) {

        float base;
        float altura;
        System.out.println("AREA DE RECTANGULO");
        System.out.println("Ingrese la base del rectangulo en centimetros");
        try {
            base = scanner.nextInt();
        } catch (InputMismatchException e) {
            base = 100;
            scanner.next();
        }
        System.out.println("Ingrese la altura del rectangulo en centimetros");
        try {
            altura = scanner.nextInt();
        } catch (InputMismatchException e) {
            altura = 100;
            scanner.next();
        }
        float resultado = base * altura;
        System.out.println("El area del rectangulo es de :" + resultado + " centimetros cuadrados");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();


    }

    private static void perimetrorectangulo(Scanner scanner) {

        float base;
        float altura;
        System.out.println("AREA DE RECTANGULO");
        System.out.println("Ingrese la base del rectangulo en centimetros");
        try {
            base = scanner.nextInt();
        } catch (InputMismatchException e) {
            base = 100;
            scanner.next();
        }
        System.out.println("Ingrese la altura del rectangulo en centimetros");
        try {
            altura = scanner.nextInt();
        } catch (InputMismatchException e) {
            altura = 100;
            scanner.next();
        }
        float resultado = (base*2) + (altura*2);
        System.out.println("El perimetro del rectangulo es de :" + resultado + " centimetros");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();


    }
}
