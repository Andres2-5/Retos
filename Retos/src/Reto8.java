import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String nom;
        int edad;
        int respu;
        int auxi;
        int numePer = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("A que auxilio quiere aplicar: 1 Transporte 2 Alimenticio");
            auxi=lectura.nextInt();

            System.out.print("Ingrese el nombre de la persona: ");
            nom=lectura.nextLine();
            lectura.nextLine();
            
            System.out.print("Ingrese la edad de la persona: ");
            edad=lectura.nextInt();

            System.out.println("La persona " + nom + " ha sido registrada al auxilio.");
            
            numePer++;
            
            System.out.print("¿Quiere registrar a otra persona? 1 Si 2 No: ");
            respu=lectura.nextInt();
        }
        System.out.println("Se han registrado " + numePer + " personas al auxilio.");
        lectura.close();
    }
}
