public class Consumidor {

    private String nombre;

    public Consumidor(String nombre, int consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    private int consumo;

}
