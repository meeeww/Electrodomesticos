public class Ejecutable {
    private Electrodomesticos[] m_listaElectrodomesticos = new Electrodomesticos[10];

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
        m_listaElectrodomesticos[0] = nevera;
        m_listaElectrodomesticos[1] = microondas;
        m_listaElectrodomesticos[2] = aspiradora;
        m_listaElectrodomesticos[3] = horno;
        m_listaElectrodomesticos[4] = refrigerador;
        m_listaElectrodomesticos[5] = congelador;
        m_listaElectrodomesticos[6] = batidora;
        m_listaElectrodomesticos[7] = trituradora;
        m_listaElectrodomesticos[8] = secador;
        m_listaElectrodomesticos[9] = tostadora;
    }

    public Electrodomesticos[] getElectrodomesticos() {
        return m_listaElectrodomesticos;
    }
}
