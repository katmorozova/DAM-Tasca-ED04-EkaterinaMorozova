package biblioteca;

/**
 *  Clase Main que gestiona el préstamo y la devolución
 *  de libros en una biblioteca mediante la creación
 *  y manipulación de objetos de la clase Llibre.
 *
 *  Ejecuta un ejemplo práctico de uso.
 *
 * @author Ekaterina Morozova
 */

public class Main {
    /**
     * Constructor per defecte de la classe Main
     */
    //costructor por defecto
   // public Main() {}

    /**
     * Método principal del programa.
     * Inicia la gestión del libro llamando al método gestionarLlibre.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        gestionarLlibre(4, 2);
    }

    /**
     * Gestiona las operaciones principales sobre un libro:
     * muestra sus datos, presta ejemplares y devuelve ejemplares.
     *
     * @param quantitatAPrestar -> cantidad de ejemplares a prestar
     * @param quantitatARetornar -> cantidad de ejemplares a devolver
     */
    private static void gestionarLlibre(int quantitatAPrestar, int quantitatARetornar) {
        Llibre llibrePrincipal = new Llibre("Tirant lo Blanc", "Joanot Martorell", 10, 19.95f);

        llibrePrincipal.mostrarDades();
        System.out.println();
        try {
            llibrePrincipal.prestarLlibre(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        llibrePrincipal.retornarLlibre(2);
        System.out.println();
        llibrePrincipal.mostrarDades();
    }
}
