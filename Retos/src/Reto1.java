import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {

      int graCent;
      int perNum;
      float hariGra;
      float hariKil;

      Scanner lectura=new Scanner(System.in);

      System.out.println("Digite los grados Centigrados que quiera para converirlos a Kelvin");
      graCent=lectura.nextInt();
      System.out.println("Digite la cantidad de personas");
      perNum=lectura.nextInt();

      System.out.println(graCent + "grados Centigrados" + "=" + (graCent + 273.15));
      hariGra=perNum*13;
      hariKil=hariGra/1000;
      System.out.println("Los kilogramos que se necesitan para la torta son: " + hariKil);
      
      lectura.close();
    }
}