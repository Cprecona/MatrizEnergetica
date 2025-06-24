//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creo la ciudad
        Ciudad springfield = new Ciudad();

        // Creo una central nuclear en springfield con sus reactores y propietario.
        Propietario Burns = new Propietario("20000001435","Burns");
        CentralNuclear nuclear = new CentralNuclear(Burns, 150,250);
        nuclear.agregarReactores(92);
        springfield.agregarCentral(nuclear);

        // Agrego consumidores

        Consumidor pepe = new Consumidor("Pepe", 400);
        Consumidor tito = new Consumidor("Tito", 300);
        // AGREGAR MÉTODO PARA QUE SUME A LOS CONSUMIDORES

        // Aplico los métodos

        System.out.println(springfield.getConsumoTotal());
        springfield.getCentrales();
        System.out.println(springfield.sosEficiente());
        springfield.getPropietarios();
        System.out.println(springfield.sosSustentable());
        System.out.println(springfield.sosPeligrosa());


    }
}