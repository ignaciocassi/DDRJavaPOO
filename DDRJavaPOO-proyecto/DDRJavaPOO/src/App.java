import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String nombre="Nacho";
        String apellido="Cassi";
        int edad=23;
        double salario=40.000;

        Empleado empleado = new Empleado(nombre,apellido,edad,salario);
        
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellido());
        System.out.println(empleado.getEdad());
        System.out.println(empleado.getSalario());
    }

    //Solicita los datos del empleado por teclado, crea un empleado
    //y lo devuelve.
    public static Empleado crearEmpleado() {

        Scanner sc=new Scanner(System.in);
        String nombre=sc.nextLine();
        sc.close();

        sc=new Scanner(System.in);
        String apellido=sc.nextLine();
        sc.close();

        sc=new Scanner(System.in);
        int edad=sc.nextInt();
        sc.close();

        sc=new Scanner(System.in);
        double salario=sc.nextDouble();
        sc.close();

        Empleado empleado=new Empleado(nombre, apellido, edad, salario);
        return empleado;
    }
}
