import java.util.ArrayList;

public class Juego {
    private int energia;
    private ArrayList<Explorador> exploradores;
    private Momia momia;

    public Juego() {
        energia = 100;
        exploradores = new ArrayList<>();
        momia = new Momia(0, 1);
    }

    public void agregarExplorador(Explorador e) {
        exploradores.add(e);
    }

    public void consumirEnergia(int cantidad) {
        energia -= cantidad;
    }

    public void actualizar() {
        momia.moverse();
        consumirEnergia(5);

        for (Explorador e : exploradores) {
            if (e.getPosicion() == momia.getPosicion()) {
                e.cambiarEstado("Muerto");
                System.out.println(e.getNombre() + " fue atrapado por la momia 💀");
            }
        }
    }

    public int getEnergia() {
        return energia;
    }
}