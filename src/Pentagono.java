import java.util.InputMismatchException;
import java.util.Scanner;

public class Pentagono {

    public static void pentagono(Scanner args) {
        operacionespentagono();
    }

    private static void operacionespentagono(){
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do{
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el pentagono");
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
                    areapentagono(scanner);
                    break;
                case 2:
                    perimetropentagono(scanner);
                    break;
                case 3:
                    Main.mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        }while (opcion != 3);


    }

    private static void areapentagono(Scanner scanner) {

        float entrada;
        System.out.println("AREA DE PENTAGONO");
        System.out.println("Ingrese el lado del pentagono en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float apotema = (float) ((entrada)/((2*Math.tan(0.628319))));
        System.out.println("La apotema del pentagono es de :" + apotema + " centimetros cuadrados");
        float resultado = (entrada * 5 * apotema) / 2;
        System.out.println("El area del pentagono es de :" + resultado + " centimetros cuadrados");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();

    }

    private static void perimetropentagono(Scanner scanner) {

        float entrada;
        System.out.println("PERIMETRO DE PENTAGONO");
        System.out.println("Ingrese un lado del pentagono en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = entrada * 5;
        System.out.println("El perimetro del pentagono es de :" + resultado + " centimetros");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();

    }
}
