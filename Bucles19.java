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
        int suma = 0;
        int cantidad = 10;

        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(100) + 1;
            suma += numero;
            System.out.println("Número aleatorio " + (i + 1) + ": " + numero);
        }

        double media = (double) suma / cantidad;

        System.out.println("La media de los números aleatorios es: " + media);
    }
}