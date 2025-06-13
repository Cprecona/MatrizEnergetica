public abstract class Centrales {


    protected int cantEnergia;
    protected int capacidadMaxima;
    protected int nivelEmision;
    protected Propietario propietario;

    public Centrales(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getCantEnergia() {
        return cantEnergia;
    }

    public void setCantEnergia(int cantEnergia) {
        this.cantEnergia = cantEnergia;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getNivelEmision() {
        return nivelEmision;
    }

    public void setNivelEmision(int nivelEmision) {
        this.nivelEmision = nivelEmision;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }







}