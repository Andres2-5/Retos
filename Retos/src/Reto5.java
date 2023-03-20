import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
    
    Scanner lectura=new Scanner(System.in);

    int vende;
    String nomClie;
    int cantiPro=0;
    int pre=0,pre1=0,tot=0,m=0;
    String vendedor;

    System.out.println("Digite quien quiere que realize la venta: 0 Jaime, 1 Pepe, 2 Juan ");
    vende=lectura.nextInt();


        while (m==0) {
            System.out.println("Digite el nombre del Cliente ");
            nomClie=lectura.nextLine();
            lectura.nextLine();
            System.out.println("Cuantos productos:");
            cantiPro=lectura.nextInt();

        for (int i=0;i<cantiPro;i++){
            pre1=tot;
            System.out.println("El precio del producto:"+(i+1));
            pre=lectura.nextInt();
            tot=pre+pre1;
        }
        if (vende==1) {
            vendedor="Jaime";
            System.out.println("El vendedor fue:"+vendedor);
        } 
        else if (vende==2){
            vendedor="Pepe"; 
            System.out.println("El vendedor fue:"+vendedor); 
        }
        else if (vende==3){
             vendedor="Juan"; 
             System.out.println("El vendedor fue:"+vendedor); 
         }
        System.out.println("El total de su compra es : " + tot);
        System.out.println("El nombre del Cliente es :" + nomClie);
        System.out.println("¿Quiere hacer otra compra?:1 Si 2 No: ");
        m=lectura.nextInt();
    }
    System.out.println("Gracias por su compra vuelva pronto");
    lectura.close();
}    
}