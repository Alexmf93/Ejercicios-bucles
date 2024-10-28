import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        Random cadena = new Random();
        System.out.println("Introduzca el numero de caracteres que quiere que tenga");
        int n = sc.nextInt();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String cadenaaleatoria = "";

        for (int i = 0; i<n; i++){
            int indice = cadena.nextInt(caracteres.length());
            cadenaaleatoria += caracteres.charAt(indice);
        }
        System.out.println("Su cadena aleatoria es "+cadenaaleatoria);

    }
}