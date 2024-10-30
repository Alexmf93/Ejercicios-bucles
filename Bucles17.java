import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numerosecreto = random.nextInt(10) + 1;
        int intento = 0;

        System.out.println("¡Adivina el número entre 1 y 10!");

        while (intento != numerosecreto) {
            System.out.println("Introduce tu intento: ");
            intento = sc.nextInt();

            if (intento < 1 || intento > 10) {
                System.out.println("Por favor, ingresa un número entre 1 y 10.");
            } else if (intento < numerosecreto) {
                System.out.println("El número es mayor. Intentalo de nuevo.");
            } else if (intento > numerosecreto) {
                System.out.println("El número es menor. Intentalo de nuevo.");
            } else {
                System.out.println("Correcto! El número era " + numerosecreto + ".");
            }
        }
    }
}