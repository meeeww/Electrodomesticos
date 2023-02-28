public class App {
    public static void main(String[] args) throws Exception {
        Ejecutable ejec = new Ejecutable();

        Electrodomesticos nevera = new Electrodomesticos(50.5, "Negro", 'B', 5.5);

        System.out.println("Consumo: " + nevera.comprobarConsumoEnergetico());
        System.out.println("Color: " + nevera.comprobarColor());
        System.out.println("Precio base: " + nevera.getPrecio());
        System.out.println("Peso: " + nevera.getPeso());
        System.out.println("Precio final: " + nevera.precioFinal());


        System.out.println("----------------------");
        Lavadora bosh = new Lavadora(50.5, "Negro", 'B', 5.5, 10);

        System.out.println("Consumo: " + bosh.comprobarConsumoEnergetico());
        System.out.println("Color: " + bosh.comprobarColor());
        System.out.println("Precio base: " + bosh.getPrecio());
        System.out.println("Peso: " + bosh.getPeso());
        System.out.println("Precio final: " + bosh.precioFinalCarga());

        System.out.println("----------------------");
        Television hp = new Television(50.5, "Azul", 'F', 5.5, 10, true);

        System.out.println("Consumo: " + hp.comprobarConsumoEnergetico());
        System.out.println("Color: " + hp.comprobarColor());
        System.out.println("Precio base: " + hp.getPrecio());
        System.out.println("Peso: " + hp.getPeso());
        System.out.println("Precio final: " + hp.precioFinalTele());

        ejec.setElectrodomestico();

        double precioFinalElectrodomesticos = 0;
        double precioFinalLavadora = 0;
        double precioFinalTelevision = 0;
        System.out.println("-> " + ejec.getElectrodomesticos()[1].precioFinal());
        for(int i = 0; i < ejec.getElectrodomesticos().length; i++){
            if(ejec.getElectrodomesticos()[i] instanceof Lavadora){
                precioFinalElectrodomesticos = precioFinalElectrodomesticos + ejec.getElectrodomesticos()[i].precioFinal();
                precioFinalLavadora = precioFinalLavadora + ejec.getElectrodomesticos()[i].precioFinal();
            } else if(ejec.getElectrodomesticos()[i] instanceof Television){
                precioFinalElectrodomesticos = precioFinalElectrodomesticos + ejec.getElectrodomesticos()[i].precioFinal();
                precioFinalTelevision = precioFinalTelevision + ejec.getElectrodomesticos()[i].precioFinal();
            }
        }
        System.out.println("Precio final de los electrodomésticos: " + precioFinalElectrodomesticos);
        System.out.println("Precio final de las lavadoras: " + precioFinalLavadora);
        System.out.println("Precio final de las televisiones: " + precioFinalTelevision);
    }
}
