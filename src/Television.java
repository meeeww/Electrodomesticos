public class Television extends Electrodomesticos {
    //constantes
    private final double pulgadas = 20;
    private final boolean sintonizador = false;
    //variables
    private double _pulgadas = pulgadas;
    private boolean _sintonizador = sintonizador;

    //constructores
    public Television() {
        super();
    }

    public Television(double p_precio, double p_peso) {
        super(p_precio, p_peso);
    }

    public Television(double p_precio, String p_color, char p_consumo, double p_peso, double p_pulgadas, boolean p_sintonizador) {
        super(p_precio, p_color, p_consumo, p_peso);
        setPulgadas(p_pulgadas);
        setSintonizador(p_sintonizador);
    }

    //pulgadas
    public void setPulgadas(double m_pulgadas){
        this._pulgadas = m_pulgadas;
    }

    public double getPulgadas(){
        return this._pulgadas;
    }

    //sintonizador
    public void setSintonizador(Boolean m_sintonizador){
        this._sintonizador = m_sintonizador;
    }

    public boolean getSintonizador(){
        return this._sintonizador;
    }

    //precio final
    public double precioFinalTele(){
        double electroPrecio = precioFinal();
        
        if(this._pulgadas >= 40){
            electroPrecio = ((130*electroPrecio)/100);
        }
        System.out.println(electroPrecio);
        if(this._sintonizador){
            electroPrecio += 50;
        }

        return electroPrecio;
    }


}
