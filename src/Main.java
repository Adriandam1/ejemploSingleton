

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){

    //Dato dato1 = Dato("Pepe", 23, "dato1");
    Dato dato1 = Dato.getInstance();
        System.out.println(dato1.getNombre()+","+dato1.getEdad()+","+dato1.getOtro());

        Dato dato2 = Dato.getInstance();
        System.out.println(dato2.getNombre()+","+dato2.getEdad()+","+dato2.getOtro());


    }

}