import java.util.Scanner;
public class Cadena{

    public static void main(String[] args){

        Scanner almacenar = new Scanner(System.in);
        String nombre = "Aljandro";
        System.out.println("Nombre: " + nombre);
        System.out.println("Escribe tu nombre: ");
        nombre = almacenar.nextLine();

        System.out.println("Tu nombre es: "+ nombre);


    }
}