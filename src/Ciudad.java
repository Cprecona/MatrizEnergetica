import java.util.HashSet;

public class Ciudad {

    private HashSet<Consumidor> consumidores = new HashSet<>();

    private HashSet<Central> centrales = new HashSet<>();
    private HashSet<Central> contaminantes = new HashSet<>(); // no hacerlo como atributo sino como return
    private HashSet<Propietario> propietarios = new HashSet<>();
    private int consumoTotal;
    private int produccionTotal;

    public HashSet<Central> getCentrales() {
        return centrales;
    }

    public int getConsumoTotal() {
        return consumoTotal;
    }

    public void setConsumoTotal() {
        int total = 0;
        for (Consumidor unConsumidor: consumidores) {
            total += unConsumidor.getConsumo();

        }

    }

    public void agregarCentral(Central unaCentral) {
        this.centrales.add(unaCentral);
    }

    public void setContaminantes() {
        for(Central unaCentral: centrales) {
            if (unaCentral.nivelEmision>=70) {
                this.contaminantes.add(unaCentral);
            }
        }

    }

    public HashSet<Central> getContaminantes() {
        return contaminantes;
    }

    public int emisionTotal() {
        int suma = 0;
        for(Central unaCentral: centrales) {
            suma+= unaCentral.nivelEmision;

        }
        return suma;
    }

    public boolean sosContaminante() {
        return this.emisionTotal()>= 70;

    }

    public boolean sosEficiente() {
        return this.emisionTotal() < 82;

    }

    public void setPropietarios() {
        for(Central unaCentral: centrales) {
            propietarios.add(unaCentral.getPropietario());

        }
    }

    public HashSet<Propietario> getPropietarios() {
        return this.propietarios;
    }

    public void setProduccionTotal() {
        int suma = 0;
        for (Central unaCentral: centrales) {
            suma += unaCentral.getCantEnergia();
        }
    }

    public boolean sosSustentable() {
        return this.consumoTotal < this.produccionTotal;

    }

    public boolean sosPeligrosa() {

        return this.centrales.stream().anyMatch(central -> central.cantEnergia >= central.capacidadMaxima);

    }

}
