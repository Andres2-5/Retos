import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args){
        int apt;
        int juga,compu;

        Scanner lectura=new Scanner(System.in);

        System.out.println("Cuanto quiere apostar?: ");
        apt=lectura.nextInt();
        System.out.println("2 cara 3 sello: ");
        juga=lectura.nextInt();

        Random ran=new Random();
        compu=ran.nextInt(2);

        if (juga==compu) {
            System.out.println("Felicidades a ganado");
            apt+=2;
        }else{
            System.out.println("Le a ganado la computadora, más suerte a la proxima");
            apt=0;
        }
        System.out.println("El dinero que le a quedado es: " + apt);
        lectura.close();
    }
}
