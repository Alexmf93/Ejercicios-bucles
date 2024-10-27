import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cadena ");
        String cadena = sc.nextLine();
        String cadenainvertida = "";

        for (int i = cadena.length() -1; i>=0 ; i--) {
            cadenainvertida += cadena.charAt(i);
        }
        System.out.printf("Su cadena invertida es: "+cadenainvertida);

        }
    }