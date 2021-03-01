import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Empleado empleado=crearEmpleado();
        System.out.println(empleado.toString());
    }

    //Solicita los datos del empleado por teclado, crea un empleado
    //y lo devuelve.
    public static Empleado crearEmpleado() {
        Scanner sc=new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Ingrese el nombre del empleado: ");
                String nombre=sc.nextLine();

                System.out.println("Ingrese el apellido del empleado: ");
                String apellido=sc.nextLine();

                System.out.println("Ingrese la edad del empleado: ");
                int edad=sc.nextInt();

                System.out.println("Ingrese el salario del empleado: ");
                double salario=sc.nextDouble();
                
                Empleado empleado=new Empleado(nombre, apellido, edad, salario);
                return empleado;
            } catch (InputMismatchException e) {
                System.out.println("El tipo de dato ingresado no es válido. ");
            } finally {
                sc.close();
            }
        }
    }

    
}
