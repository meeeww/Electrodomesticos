public class Ejecutable {
    private Electrodomesticos[] m_listaElectrodomesticos = new Electrodomesticos[8];

    Electrodomesticos nevera = new Electrodomesticos(505.75, "Blanco", 'D', 25.5);
    Television microondas = new Television(505.75, "Blanco", 'D', 25.5, 20, true);
    Electrodomesticos aspiradora = new Electrodomesticos(505.75, "Blanco", 'D', 25.5);
    Lavadora horno = new Lavadora(505.75, "Blanco", 'D', 25.5, 10);
    Television refrigerador = new Television(505.75, "Blanco", 'D', 25.5, 54, false);
    Electrodomesticos congelador = new Electrodomesticos(505.75, "Blanco", 'D', 25.5);
    Lavadora batidora = new Lavadora(505.75, "Blanco", 'D', 25.5, 15);
    Television trituradora = new Television(505.75, "Blanco", 'D', 25.5, 40, true);
    Electrodomesticos secador = new Electrodomesticos(505.75, "Blanco", 'D', 25.5);
    Lavadora tostadora = new Lavadora(505.75, "Blanco", 'D', 25.5, 15);

    public void setElectrodomestico(){
        m_listaElectrodomesticos[1] = refrigerador;
    }

    public Electrodomesticos[] getElectrodomesticos() {
        return m_listaElectrodomesticos;
    }
}
