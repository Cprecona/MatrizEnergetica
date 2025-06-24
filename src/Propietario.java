public class Propietario {

    private String CUIT;
    private String nombre;

    public Propietario(String CUIT, String nombre) {
        this.CUIT = CUIT;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCUIT() {
        return CUIT;
    }


}
