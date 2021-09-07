import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Mexicano persona1 = new Mexicano();
        System.out.println("Curp de la persona 1: " + persona1.getCURP());
        System.out.println();
        System.out.println();

        Mexicano persona2 = new Mexicano();
        System.out.println("RFC de la persona 2: " + persona2.getRFC());
        System.out.println();
        System.out.println();

        //Persona 3 jaja, como mi juego favorito
        Mexicano persona3 = new Mexicano();
        System.out.println("Curp de la persona 3: " + persona3.getCURP());
        System.out.println("RFC de la persona 3: " + persona3.getRFC());
        System.out.println();
        System.out.println();
    }
}
