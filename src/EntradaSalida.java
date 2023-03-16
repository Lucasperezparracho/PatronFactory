import java.util.Scanner;

public class EntradaSalida {
        public static int EmtradaInt(String mensaje) {
            Scanner sc = new Scanner(System.in);
            System.out.println(mensaje);
            return sc.nextInt();

    }
}
