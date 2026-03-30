public class Momia {
    private int posicion;
    private int velocidad;

    public Momia(int posicion, int velocidad) {
        this.posicion = posicion;
        this.velocidad = velocidad;
    }

    public void moverse() {
        posicion += velocidad;
    }

    public int getPosicion() {
        return posicion;
    }
}