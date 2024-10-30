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
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitudcontraseña = 8;
        System.out.println("Cuantas contraseñas desea generar?");
        int cantidad = sc.nextInt();
        sc.nextLine();
         for (int i =0; i<cantidad; i++) {
             String password = "";
             for (int j = 0; j < longitudcontraseña; j++) {
                 int indice = random.nextInt(caracteres.length());
                 password += caracteres.charAt(indice);
             }
             System.out.println("Su contraseña es: " + password);
         }
    }
}