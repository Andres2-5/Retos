import java.util.Scanner;
public class Reto2 {
    public static void main(String[] agrs) {
        int pesoBebe;
        int edadBebe;
        String nomMedico;
        String nomMama;
        String nomBebe;
        int mesActual;
        int mesNacimiento;
        int añoActual;
        int añoNacimiento;
        int edad = 0;

        Scanner lectura = new Scanner(System.in); 

        System.out.println("Digite peso del bebe:");
        pesoBebe = lectura.nextInt();
        System.out.println("Digite la edad del bebe:");
        edadBebe = lectura.nextInt();
        System.out.println("Nombre del medico:");
        nomMedico = lectura.next();
        System.out.println("Nombre de la mama:");
        nomMama = lectura.next();
        System.out.println("Nombre del bebe:");
        nomBebe = lectura.next();
        System.out.println("Ingrese año actual:");
        añoActual = lectura.nextInt();
        System.out.println("Ingrese año nacimiento");
        añoNacimiento = lectura.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        mesNacimiento = lectura.nextInt();
        System.out.println("Ingrese mes actual");
        mesActual = lectura.nextInt();

        edad=añoActual-añoNacimiento;
        
        System.out.println("Las dosis sumistradas son:" + (pesoBebe + 10) / (edadBebe * 10) * 8);
        System.out.println("El peso del bebe es:" + (pesoBebe + 15));
        System.out.println("Los años del bebe son:" + (edad = añoActual - añoNacimiento));
        System.out.println("Los meses del bebe son:" + (edad = añoActual - añoNacimiento) * 12);
        lectura.close();
    }
}