import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadrado {

    public static void cuadrado(Scanner args){
        operacionescuadrado();
    }

    private static void operacionescuadrado(){
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do{
            System.out.println("Estimado usuario, seleccione que calculo desea realizar con el cuadrado");
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
                    areacuadrado(scanner);
                    break;
                case 2:
                    perimetrocuadrado(scanner);
                    break;
                case 3:
                    Main.mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }

        }while (opcion != 3);


    }
    private static void areacuadrado(Scanner scanner) {

        float entrada;
        System.out.println("AREA DE CUADRADO");
        System.out.println("Ingrese un lado del cuadrado en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = (float) (Math.pow(entrada, 2));
        System.out.println("El area del cuadrado es de :" + resultado + " centimetros cuadrados");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();


    }

    private static void perimetrocuadrado(Scanner scanner) {

        float entrada;
        System.out.println("PERIMETRO DE CUADRADO");
        System.out.println("Ingrese un lado del cuadrado en centimetros");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = 100;
            scanner.next();
        }
        float resultado = entrada * 4;
        System.out.println("El perimetro del cuadrado es de :" + resultado + " centimetros");
        Resultados.listaResultados.add(new Resultados(resultado));
        Main.mainmenu();


    }

}
