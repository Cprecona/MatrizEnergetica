import java.util.ArrayList;

public class CentralNuclear extends Central {

    public CentralNuclear(Propietario propietario, int potenciaReactor1, int capacidadMaxima) {
        super(propietario, capacidadMaxima);
        agregarReactores(potenciaReactor1);
    }

    private ArrayList<Reactor> reactores = new ArrayList<>();

    private int nivelEmision;

    @Override
    public void setNivelEmision(int nivelEmision) {
        this.nivelEmision = getCantReactores() * 41;
    }

    @Override
    public int getNivelEmision() {
        return nivelEmision;
    }

    public int getCantReactores() {
        return this.reactores.size();
    }

    public void agregarReactores(int potencia) {
        if (this.getCantReactores()+ 1 <5) {
            Reactor nuevo = new Reactor();
            nuevo.setPotenciaReactor(potencia);
            this.reactores.add(nuevo);
        } else {System.out.println("No es posible agregar más reactores");};
    }


    @Override
    public void setCantEnergia(int cantEnergia) {
        int sumaPotencia = 0;
        for (Reactor unReactor: reactores) {
            sumaPotencia += unReactor.getPotenciaReactor();

        }
        this.cantEnergia = sumaPotencia - 5;
    }
}
