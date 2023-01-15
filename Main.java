public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 25;
        cliente.nombre = "Carlos Javier";
        cliente.telefono = 9856489;
        cliente.credito = 50000;

        System.out.println("La edad del cliente es " + cliente.edad);
        System.out.println("El nombre del cliente es " + cliente.nombre);
        System.out.println("El telefono del cliente es " + cliente.telefono);
        System.out.println("El credito actual del cliente es " + cliente.credito + "$");

        trabajador.edad = 18;
        trabajador.nombre = "Roberto";
        trabajador.telefono = 8976645;
        trabajador.salario = 18000;

        System.out.println("La edad del trabajador es " + trabajador.edad);
        System.out.println("El nombre del trabajador es " + trabajador.nombre);
        System.out.println("El telefono del trabajador es " + trabajador.telefono);
        System.out.println("El salario actual del trabajador es " + trabajador.salario + "$ anuales");






    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;


}
class Cliente extends Persona{
    int credito;


}
class Trabajador extends Persona{
    int salario;

}

