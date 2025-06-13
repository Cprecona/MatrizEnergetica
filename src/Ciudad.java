import java.util.HashSet;

public class Ciudad {

    private HashSet<Consumidor> consumidores = new HashSet<>();
    private HashSet<Centrales> centrales = new HashSet<>();
    private HashSet<Centrales> contaminantes = new HashSet<>();
    private HashSet<Propietario> propietarios = new HashSet<>();
    private int consumoTotal;
    private int produccionTotal;

    public int getConsumoTotal() {
        return consumoTotal;
    }

    public void setConsumoTotal() {
        int total = 0;
        for (Consumidor unConsumidor: consumidores) {
            total += unConsumidor.getConsumo();

        }

    }

    public void agregarCentral(Centrales unaCentral) {
        this.centrales.add(unaCentral);
    }

    public void setContaminantes() {
        for(Centrales unaCentral: centrales) {
            if (unaCentral.nivelEmision>=70) {
                this.contaminantes.add(unaCentral);
            }
        }

    }

    public HashSet<Centrales> getContaminantes() {
        return contaminantes;
    }

    public int emisionTotal() {
        int suma = 0;
        for(Centrales unaCentral: centrales) {
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
        for(Centrales unaCentral: centrales) {
            propietarios.add(unaCentral.getPropietario());

        }
    }

    public HashSet<Propietario> getPropietarios() {
        return this.propietarios;
    }

    public void setProduccionTotal() {
        int suma = 0;
        for (Centrales unaCentral: centrales) {
            suma += unaCentral.getCantEnergia();
        }
    }

    public boolean sosSustentable() {
        return this.consumoTotal < this.produccionTotal;

    }

    public boolean sosPeligrosa() {


    }

}
