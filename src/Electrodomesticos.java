public class Electrodomesticos {
    //constantes
    private final double precioBase = 100;
    private final String color = "Blanco";
    private final char consumoEnergetico = 'A';
    private final double peso = 5;
    //variables
    private double precioFinal;
    private double _precio = precioBase;
    private String _color = color;
    private char _consumo = consumoEnergetico;
    private double _peso = peso;

    //constructores
    public Electrodomesticos() {
        setPrecio(precioBase);
        setColor(color);
        setConsumo(consumoEnergetico);
        setPeso(peso);
    }

    public Electrodomesticos(double p_precio, double _peso) {
        setPrecio(p_precio);
        setColor(color);
        setConsumo(consumoEnergetico);
        setPeso(_peso);
    }

    public Electrodomesticos(double p_precio, String _color, char consumo, double _peso) {
        setPrecio(p_precio);
        setColor(_color);
        setConsumo(consumo);
        setPeso(_peso);
    }

    //precios
    public void setPrecio(double p_precio) {
        this._precio = p_precio;
    }

    public double getPrecio() {
        return this._precio;
    }

    public double precioFinal() {
        this.precioFinal = this._precio;
        switch (this._consumo) {
            case 'A':
                this.precioFinal = this._precio + 100;
                break;
            case 'B':
                this.precioFinal = this._precio + 80;
                break;
            case 'C':
                this.precioFinal = this._precio + 60;
                break;
            case 'D':
                this.precioFinal = this._precio + 50;
                break;
            case 'E':
                this.precioFinal = this._precio + 30;
                break;
            case 'F':
                this.precioFinal = this._precio + 10;
                break;
        }
        if (this._peso >= 0 && this._peso <= 19.99) {
            this.precioFinal = this.precioFinal + 30;
        } else if (this._peso >= 20 && this._peso <= 49.99) {
            this.precioFinal = this.precioFinal + 50;
        } else if (this._peso >= 50 && this._peso <= 79.99) {
            this.precioFinal = this.precioFinal + 80;
        } else if (this._peso >= 80) {
            this.precioFinal = this.precioFinal + 100;
        }
        return this.precioFinal;
    }

    //colores
    public void setColor(String color) {
        this._color = color;
    }

    public String getColor() {
        return this._color;
    }

    public String comprobarColor() {
        switch (this._color.toLowerCase()) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                break;
            default:
                this._color = "Blanco";
        }
        return this.color.substring(0, 1).toUpperCase() + this.color.substring(1);
    }

    //consumos
    public void setConsumo(char consumo) {
        this._consumo = consumo;
    }

    public char getConsumo() {
        return this._consumo;
    }

    public char comprobarConsumoEnergetico() {
        switch (this._consumo) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                break;
            default:
                this._consumo = 'F';
        }
        return this._consumo;
    }

    //pesos
    public void setPeso(double peso) {
        this._peso = peso;
    }

    public double getPeso() {
        return this._peso;
    }

}
