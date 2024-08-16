import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangulo {

    public static void triangulo(Scanner args){
        operacionestriangulo();
    }

    private static void operacionestriangulo(){
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do{
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el triangulo");
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
                    areatriangulo(scanner);
                    break;
                case 2:
                    perimetrotriangulo(scanner);
                    break;
                case 3:
                    Main.mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        }while (opcion != 3);


    }
    private static void areatriangulo(Scanner scanner) {

        float base;
        float altura;
        System.out.println("AREA DE TRIANGULO");
        System.out.println("Ingrese la base del triangulo en centimetros");
        try {
            base = scanner.nextInt();
        } catch (InputMismatchException e) {
            base = 100;
            scanner.next();
        }
        System.out.println("Ingrese la altura del triangulo en centimetros");
        try {
            altura = scanner.nextInt();
        } catch (InputMismatchException e) {
            altura = 100;
            scanner.next();
        }
        float resultado = (base * altura) / 2;
        System.out.println("El area del triangulo es de :" + resultado + " centimetros cuadrados");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();

    }

    private static void perimetrotriangulo(Scanner scanner) {

        float entrada;
        System.out.println("PERIMETRO DE TRIANGULO");
        System.out.println("Ingrese un lado del triangulo en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = entrada * 3;
        System.out.println("El perimetro del triangulo es de :" + resultado + " centimetros");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();


    }

}
