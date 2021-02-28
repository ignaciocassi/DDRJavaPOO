public class Empleado {
    //Atributos

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    //Métodos

    
    //Método constructor:
    //public nombre_clase(parámetros para inicializar atributos)
    //Inicializa las variables, también puede ejecutar algún método.
    //Si no se crea manualmente, java crea uno automaticamente que no hace nada.
    //También puede inicializar los atributos sin parámetros, es decir, con valores
    //por defecto, como por ejemplo una constante.
    public Empleado(String nombre, String apellido, int edad, double salario) {
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", edad='" + getEdad() + "'" +
            ", salario='" + getSalario() + "'" +
            "}";
    }

    //Métodos extras:
    public boolean plus(double sueldoPlus) {
        //Suma un sueldoPlus al salario si el empleado tiene más de 40 años.
        //El método puede acceder a todos sus atributos directamente porque está
        //dentro de la clase.
        boolean aumento=false;
           if (edad>40) {
               salario+=sueldoPlus;
               aumento=true;
           }
           //Devuelve true si aplico el aumento, false si no.
           return aumento;
    }

}
