import java.util.Random;
import java.util.Scanner;

public class Reto6 {

    public static void main(String[] args){
        int apt=1000;
        int juga, compu, p;
        int total;
        int continuar;

        Scanner lectura=new Scanner(System.in);

        Random rando=new Random();
        compu=rando.nextInt(2);

        System.out.println("El juego empieza con una apuesta de 1000 ");
        apt=lectura.nextInt();
        System.out.println("1 Cara 2 Sello");
        juga=lectura.nextInt();

        while(apt>1000){
            System.out.println("Felicidades a ganado");
            total=apt++;
            System.out.println("Su saldo es: " + apt);
            if (apt==1000) {
                System.out.println("Perdio mas suerte a la proxima");
                total=apt--;
                System.out.println("Su saldo es: " + apt);
            }
        }
            System.out.println("No puede seguir jugando");
            lectura.close();
        }
    }
