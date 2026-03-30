public class Main {
    public static void main(String[] args) {

        Juego juego = new Juego();

        Explorador e1 = new Explorador("Juan", 1);
        Explorador e2 = new Explorador("Ana", 2);

        juego.agregarExplorador(e1);
        juego.agregarExplorador(e2);

        for (int i = 0; i < 5; i++) {
            System.out.println("Turno " + (i + 1));

            juego.actualizar();

            System.out.println("Energía restante: " + juego.getEnergia());
            System.out.println("----------------------");
        }
    }
}