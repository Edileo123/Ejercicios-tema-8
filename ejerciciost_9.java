public class ejerciciost_9 {
    public static void  main(String[] args){
        Cliente cliente1=new Cliente();
        cliente1.nombre="leonel";
        System.out.println("Nombre del cliente:"+cliente1.nombre);
        cliente1.edad=21;
        System.out.println("Edad del cliente:"+cliente1.edad);
        cliente1.telefono=552656;
        System.out.println("Telefono del cliente:"+cliente1.telefono);
        cliente1.credito=5000;
        System.out.println("Credito del cliente:"+cliente1.credito);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre="Rodrigo";
        System.out.println("Nombre del trabajador:"+trabajador1.nombre);
        trabajador1.edad=35;
        System.out.println("Edad del trabajador:"+trabajador1.edad);
        trabajador1.telefono=585656;
        System.out.println("Telefono del trabajador:"+trabajador1.telefono);
        trabajador1.salario=10000;
        System.out.println("Salario del trabajador:"+trabajador1.salario);



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
