import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        int saldo = 100;
        int apues;
        int elecUsu;
        int elecCom;
        String nomEleUsu, nomEleComp;

        System.out.println("Bienvenido al juego");
        System.out.println("Su saldo actual es de " + saldo + " plata");

        while (saldo > 0) {
            System.out.print("¿Cuanta plata quiere apostar? ");
            apues = lectura.nextInt();
            if (apues > saldo) {
                System.out.println("No tiene suficiente plata para jugar");
                continue;
            }
            System.out.print("1 Papel 2 Piedra 3 Tijera: ");
            elecUsu = lectura.nextInt();
            elecCom = (int) (Math.random() * 3) + 1;

            if (elecUsu == elecCom) {
                System.out.println("Empate");
            } else if ((elecUsu == 1 && elecCom == 3)
                    || (elecUsu == 2 && elecCom == 1)
                    || (elecUsu == 3 && elecCom == 2)) {
                System.out.println("Felicidades a ganado");
                saldo += apues;
            } else {
                System.out.println("Perdio mas suerte para la proxima");
                saldo -= apues;
            }

            System.out.println("Tu saldo actual es de " + saldo + " plata");
        }

        System.out.println("Gracias por jugar");
        lectura.close();
    }
}
