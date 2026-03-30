public class Explorador {
    private String nombre;
    private String estado;
    private int posicion;

    public Explorador(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.estado = "Vivo";
    }

    public void moverse(int nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public int getPosicion() {
        return posicion;
    }
}