public class Factory {
    public static final int CAMION = 0;
    public static final int BICICLETA = 1;


    public static ITransporte getProducto(int device){
        switch (device) {
            case CAMION:
                return new Camion();
            case BICICLETA:
                return new Bicicleta();
            default:
                return null;
        }
    }
}
