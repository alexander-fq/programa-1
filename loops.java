
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double mediaNota = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota de la pelicula Matrix");
            nota = teclado.nextDouble();
            mediaNota = mediaNota + nota;
            
        }
        System.out.println(mediaNota /3);
    }
}
