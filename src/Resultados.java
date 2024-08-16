import java.util.ArrayList;
import java.util.List;

public class Resultados {
    static List<Resultados> listaResultados = new ArrayList<>();
    private float resultado;

    public Resultados(float resultado) {
        this.resultado = resultado;
    }

    public float getResultado() {
        return resultado;
    }

    static void verresultados() {
        for (Resultados resultados : listaResultados ) {
            System.out.println("\n" + resultados);
            System.out.println("Resultado: " + resultados.getResultado());
        }
    }
}