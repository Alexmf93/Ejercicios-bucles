import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduca un número entero");
        int numero = sc.nextInt();

        int contador = 0;

        if (numero == 0) {
            contador = 1;
        } else {
            if (numero < 0) {
                contador++;
                numero = -numero;
            }

            while (numero > 0) {
                contador++;
                numero /= 10;
            }
        }
        System.out.println("Cantidad de dígitos: " + contador);
    }
}