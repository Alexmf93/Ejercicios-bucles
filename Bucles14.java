import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su cadena");
        String cadena = sc.nextLine();
        String cadenacambiada = "";

        for (int i= 0; i < cadena.length(); i++) {
            char caracteres = cadena.charAt(i);
            if (caracteres >= 'a' && caracteres <= 'z') {
                cadenacambiada += (char) (caracteres - 32);
            } else if (caracteres >= 'A' && caracteres <= 'Z') {
                cadenacambiada += (char) (caracteres + 32);
            } else {
                cadenacambiada += caracteres;
            }
            System.out.println("Su cadena cambiada es: " + cadenacambiada);
        }
    }
}