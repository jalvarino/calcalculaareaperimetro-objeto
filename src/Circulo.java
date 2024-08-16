import java.util.InputMismatchException;
import java.util.Scanner;

public class Circulo {

    public static void circulo(Scanner args) {
        operacionescirculo();
    }


    private static void operacionescirculo(){
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do{
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el circulo");
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
                    areacirculo(scanner);
                    break;
                case 2:
                    perimetrocirculo(scanner);
                    break;
                case 3:
                    Main.mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        }while (opcion != 3);


    }
    private static void areacirculo(Scanner scanner) {

        float entrada;
        System.out.println("AREA DE CIRCULO");
        System.out.println("Ingrese el radio del circulo en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = (float) (Math.pow(entrada, 2) * Math.PI);
        System.out.println("El area del circulo es de :" + resultado + " centimetros cuadrados");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();


    }

    private static void perimetrocirculo(Scanner scanner) {

        float entrada;
        System.out.println("PERIMETRO DE CIRCULO");
        System.out.println("Ingrese el radio del circulo en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = (float) (entrada * 2 * Math.PI);
        System.out.println("El perimetro del circulo es de :" + resultado + " centimetros");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();


    }
}
