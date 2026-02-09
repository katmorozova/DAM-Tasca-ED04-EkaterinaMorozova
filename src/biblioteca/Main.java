package biblioteca;

public class Main {
    public static void main(String[] args) {
        gestionarLlibre(4, 2);
    }

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
