public class Main {
    static ITransporte vehiculo;//Creamos una variable del tipo de la Interfaz, que inicializaremos más adelante
    public static void main(String[] args) {
        System.out.println("AQUÍ PONEMOS E PRACRTICA EL MDOELO FACTORY");

        Float coste =0f;
        Integer tipoEmbalage = 0;
        String tipo ="";

        int device = EntradaSalida.EmtradaInt("Que vehiculo vas a elegir? \n" +
                "0. CAMION" + "\n" +
                "1. BICICLETA " +"\n"+
                "2. Barco ");

        switch (device){
            case Factory.CAMION:
                vehiculo = Factory.getProducto(device);
                coste = vehiculo.costeTotal(36214);
                tipoEmbalage = vehiculo.tipoEmbalage(10f,10f,20f,10f);
                break;
            case Factory.BICICLETA:
                vehiculo = Factory.getProducto(device);
                coste = vehiculo.costeTotal(500);
                tipoEmbalage = vehiculo.tipoEmbalage(40f,30f,70f,30f);
                break;
            case Factory.Barco:
                vehiculo = Factory.getProducto(device);
                coste = vehiculo.costeTotal(80657);
                tipoEmbalage = vehiculo.tipoEmbalage(80f,80f,160f,50f);

        }

        if(tipoEmbalage==null){
            System.out.println("El tipo de vehiculo elegido no sirve para este embalage");
        }
        else {
            if (tipoEmbalage == ITransporte.CAJA_MADERA){
                tipo = "CAJA DE MADERA";
            } else if (tipoEmbalage == ITransporte.CAJA_CARTON) {
                tipo = "CAJA DE CARTON";
            } else if (tipoEmbalage == ITransporte.PALLET) {
                tipo = "PALLET";
            }

            System.out.println("Coste de envio: " + coste + " tipo de embalaje: " + tipo);
        }




    }
}