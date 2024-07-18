import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
    String nombre = "";
    Integer edad = null;
    String genero = "";
    String preferenciaTrabajo = "";
    String nacionalidad = "";
    String tipoSangre = "";
    

Scanner sc = new Scanner(System.in);
Scanner scInt = new Scanner(System.in);
System.out.println("Ingrese su nombre: ");
nombre = sc.nextLine();
boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.println("Ingrese su edad: ");
                edad = Integer.parseInt(sc.nextLine());  // Use nextLine() to avoid skipping issues
                edadValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido para la edad.");
            }
        }
System.out.println("Ingrese su genero: ");
genero = sc.nextLine();
System.out.println("Ingrese su preferencia de trabajo: ");
preferenciaTrabajo = sc.nextLine();
System.out.println("Ingrese su nacionalidad: ");
nacionalidad = sc.nextLine();
System.out.println("Ingrese su tipo de sangre: ");
tipoSangre = sc.nextLine();
Integer anioNacimiento = 2024 - edad;

System.out.println("Ingresos exitosos, sus datos serán mostrados a continuación:");
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
System.out.println("Género: " + genero);
System.out.println("Trabajo preferido: " + preferenciaTrabajo);
System.out.println("Nacionalidad: " + nacionalidad);
System.out.println("Tipo de sangre: " + tipoSangre);
System.out.println("Año de nacimiento: " + anioNacimiento);
sc.close();
scInt.close();
}
}