public class ejerciciost8 {
    public static void main(String[]args){
        Persona persona1 = new Persona();
        persona1.setEdad(25);
        System.out.println(persona1.getEdad());
        persona1.setNombre("Leonel");
        System.out.println(persona1.getNombre());
        persona1.setNumero(2565613);
        System.out.println(persona1.getNumero());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int numero;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getNumero(){
        return this.numero;
    }
}
