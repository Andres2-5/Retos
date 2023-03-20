import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args){
        int apos;
        int juga,computa;

        Scanner lectura=new Scanner(System.in);

        System.out.println("Señor cuanto quiere apostar: ");
        apos=lectura.nextInt();
        System.out.println("Con que quiere empezar a jugar: 1 piedra, 2 tijera o 3 papel: ");
        juga=lectura.nextInt();

        Random ran=new Random();
        computa=ran.nextInt(3);
if (computa==1 ) {
    if (juga==3 ) {
    System.out.print("Felicidades usted a ganado la maquina saco piedra");
    apos*=2;
    }
   else if (juga==2) {
    System.out.print("Felicidades usted a ganado la maquina saco papel");
    apos=0;
   }
   else {
    System.out.print("Nadie gano la maquina saco tijera");
    apos*=1;
   }
} 
else if (computa==3) {
    if (juga==2) {
        System.out.print("Felicidades usted a ganado la maquina saco papel");
    }
   else if (juga==3) {
    System.out.print("Nadie gano la maquina saco papel");
    apos*=2;
   }
   else {
    System.out.print("Felicidades usted a ganado la maquina saco papel");
    apos*=1;
   } 
}
else {
    if (juga==2) {
        System.out.print("Usted a perdido la maquina saco piedra");
        apos=0;
    }
   else if (juga==3) {
    System.out.print("Felicidades a ganado la maquina saco papel");
    apos *=1;
   }
   else {
    System.out.print("Nadie gano la maquina saco tijera");
    apos *=2;
   } 

}
System.out.print("El total de dinero que le quedo es: " + apos);
lectura.close();
    }
}
