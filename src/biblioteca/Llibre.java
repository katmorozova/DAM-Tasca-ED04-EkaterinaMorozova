package biblioteca;

/**
 *  Clase Llibre que dispone sus atributos,
 *  métodos para gestionar prestación y
 *  devolución de los libros en una biblioteca
 *
 * @author Ekaterina Morozova
 */
public class Llibre {
    private String titol;
    private String autor;
    private int exemplars;
    private float preu;

    /**
     * Devuelve el título del libro
     * @return titulo del llibro
     */
    public String getTitol() {
        return titol;
    }

    /**
     * Establece el título del libro
     * @param titol  -> nuevo título del libro
     * @return el propio objeto para permitir encadenamiento de métodos
     */
    public Llibre setTitol(String titol) {
        this.titol = titol;
        return this;
    }

    /**
     * Devuelve el nombre del autor del libro
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro
     * @param autor -> nombre del autor
     * @return el propio objeto para permitir encadenamiento de métodos
     */
    public Llibre setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    /**
     * Devuelve el número de ejemplares disponibles
     * @return cantidad de ejemplares
     */
    public int getExemplars() {
        return exemplars;
    }

    /**
     * Establece el número de ejemplares disponibles
     * @param exemplars -> nueva cantidad de ejemplares
     * @return el propio objeto para permitir encadenamiento de métodos
     */
    public Llibre setExemplars(int exemplars) {
        this.exemplars = exemplars;
        return this;
    }

    /**
     * Devuelve el precio del libro
     * @return precio del libro
     */
    public float getPreu() {
        return preu;
    }

    /**
     * Establece el precio del libro
     * @param preu -> nuevo precio del libro
     * @return el propio objeto para permitir encadenamiento de métodos
     */
    public Llibre setPreu(float preu) {
        this.preu = preu;
        return this;
    }

    /**
     * Constructor que crea un libro con todos sus datos
     * @param titol -> título del libro
     * @param autor -> autor del libro
     * @param exemplars -> número de ejemplares disponibles
     * @param preu -> precio del libro
     */
    public Llibre(String titol, String autor, int exemplars, float preu) {
        this.titol = titol;
        this.autor = autor;
        this.exemplars = exemplars;
        this.preu = preu;
    }

    /**
     * Presta una cantidad determinada de ejemplares del libro.
     * Si no hay suficientes ejemplares disponibles, lanza una excepción.
     * @param quantitat número de ejemplares a prestar
     * @throws Exception si no hay suficientes ejemplares disponibles
     */
    public void prestarLlibre(int quantitat) throws Exception {
        if (exemplars >= quantitat) {
            exemplars -= quantitat;
            System.out.println("S'han prestat " + quantitat + " exemplars.");
        } else {
            throw new Exception("No hi ha prou exemplars disponibles.");
        }
    }

    /**
     * Devuelve una cantidad determinada de ejemplares al inventario del libro
     * @param quantitat -> número de ejemplares que se devuelven
     */
    public void retornarLlibre(int quantitat) {
        exemplars += quantitat;
        System.out.println("S'han retornat " + quantitat + " exemplars.");
    }

    /**
     * Muestra por consola todos los datos del libro:
     * título, autor, número de ejemplares y precio
     */
    public void mostrarDades() {
        System.out.println("Títol: " + titol);
        System.out.println("Autor: " + autor);
        System.out.println("Exemplars: " + exemplars);
        System.out.println("Preu: " + preu + " €");
    }
}
