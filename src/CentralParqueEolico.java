public class CentralParqueEolico extends Central {

    private int cantGeneradores;
    private int aporteGenerador = 13;
    private int nivelEmision = 0;

    public CentralParqueEolico(Propietario propietario, int capacidadMaxima) {
        super(propietario, capacidadMaxima);
    }

    @Override
    public int getNivelEmision() {
        return nivelEmision;
    }

    public int getAporteGenerador() {
        return aporteGenerador;
    }

    public int getCantGeneradores() {
        return cantGeneradores;
    }

    public void setCantGeneradores(int cantGeneradores) {
        this.cantGeneradores = cantGeneradores;
    }

    @Override
    public void setCantEnergia(int cantEnergia) {
        this.cantEnergia = cantGeneradores * aporteGenerador;
    }
}
