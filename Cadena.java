import java.util.Scanner;
public class Cadena{

    public static void main(String[] args){

        Scanner almacenar = new Scanner(System.in);
        String nombre = "Aljandro";
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Escribe tu nombre: ");
        nombre = almacenar.nextLine();
        System.out.println("Escribe tu apellido Paterno: ");
        String apellodo_Paterno = almacenar.nextLine();
        System.out.println("Escribe tu apellido Materno: ");
        String apellido_Materno = almacenar.nextLine();

        System.out.println("Tu nombre es: "+ nombre + " "+apellodo_Paterno + " " +apellido_Materno);


    }
}