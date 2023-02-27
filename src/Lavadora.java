public class Lavadora extends Electrodomesticos {
    //constantes
    private final double carga = 5;
    //variables
    private double _carga = carga;

    //constructores
    public Lavadora() {
        super();
    }

    public Lavadora(double p_precio, double p_peso) {
        super(p_precio, p_peso);
    }

    public Lavadora(double p_precio, String p_color, char p_consumo, double p_peso, double p_carga) {
        super(p_precio, p_color, p_consumo, p_peso);
        setCarga(p_carga);
    }

    //carga
    public void setCarga(double m_carga){
        this._carga = m_carga;
    }

    public double getCarga(){
        return this._carga;
    }

    public double precioFinalCarga(){
        double electroPrecio = precioFinal();
        if(this._carga >= 30){
            electroPrecio += 50;
        }

        return electroPrecio;
    }


}
