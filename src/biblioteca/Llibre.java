package biblioteca;

public class Llibre {
    private String titol;
    private String autor;
    private int exemplars;
    private float preu;

    public String getTitol() {
        return titol;
    }

    public Llibre setTitol(String titol) {
        this.titol = titol;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    public Llibre setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public int getExemplars() {
        return exemplars;
    }

    public Llibre setExemplars(int exemplars) {
        this.exemplars = exemplars;
        return this;
    }

    public float getPreu() {
        return preu;
    }

    public Llibre setPreu(float preu) {
        this.preu = preu;
        return this;
    }

    public Llibre(String titol, String autor, int exemplars, float preu) {
        this.titol = titol;
        this.autor = autor;
        this.exemplars = exemplars;
        this.preu = preu;
    }

    public void prestarLlibre(int quantitat) throws Exception {
        if (exemplars >= quantitat) {
            exemplars -= quantitat;
            System.out.println("S'han prestat " + quantitat + " exemplars.");
        } else {
            throw new Exception("No hi ha prou exemplars disponibles.");
        }
    }

    public void retornarLlibre(int quantitat) {
        exemplars += quantitat;
        System.out.println("S'han retornat " + quantitat + " exemplars.");
    }

    public void mostrarDades() {
        System.out.println("Títol: " + titol);
        System.out.println("Autor: " + autor);
        System.out.println("Exemplars: " + exemplars);
        System.out.println("Preu: " + preu + " €");
    }
}
