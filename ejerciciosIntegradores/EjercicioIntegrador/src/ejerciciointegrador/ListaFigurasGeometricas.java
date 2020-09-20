package ejerciciointegrador;

import java.util.ArrayList;

/**
 *
 * @author Juan Pablo Romano<programming@jpromano.net>
 */
public class ListaFigurasGeometricas {

    public static ArrayList<FiguraGeometrica> listaFigurasGeometricas = new ArrayList();

    public static void mostrar() {
        for (FiguraGeometrica figura : listaFigurasGeometricas) {
            figura.mostrar();
        }
    }

    public static void agregar(FiguraGeometrica figura) {
        listaFigurasGeometricas.add(figura);
    }

}
