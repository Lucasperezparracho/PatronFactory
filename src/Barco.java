public class Barco implements ITransporte{
    @Override
    public Float costeTotal(Integer cp) {
        int diferencia =  cp - CENTRO_CIUDAD;
        if (diferencia > 100){
            return 5.7f;
        } else if (diferencia > 200) {
            return 6.7f;
        } else if (diferencia >400) {
            return 8f;
        }else {
            return 10f;
        }

    }
    @Override
    public Integer tipoEmbalage(Float x, Float y, Float z, Float peso) {
        if (x < 10 && y < 20 && z<20 || peso <=10){
            return CAJA_CARTON;
        }else if (x < 20 && y < 40 && z<40 || peso >10 && peso <20){
            return CAJA_MADERA;
        }else {
            return PALLET;
        }
    }
}
