import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100) + 1;
        int intento = 0;
        boolean adivinado = false;

        System.out.println("Intente adivinar un numero entre el 1 y el 100");

        while (!adivinado) {
            System.out.println("Introduce tu adivinanza: ");
            intento = sc.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                adivinado = true;
            }
        }
    }
}