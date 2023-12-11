public class Dato {
    private String nombre;
    private int edad;

    private String otro;

    static Dato miDatoUnico = new Dato ("Alumno", 18, "unico");

    private Dato(String nombre, int edad, String otro){
        this.nombre= nombre;
        this.edad= edad;
        this.otro= otro;
    }

    public static Dato getInstance(){
        //static Dato miDatoUnico = new Dato ("Alumno", 18, "unico");
        return miDatoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }
}
