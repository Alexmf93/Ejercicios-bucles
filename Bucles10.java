import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        String cadena;
        int contadorcadenas = 0;
        String cadenamaslarga = "";

        System.out.println("Introduce cadenas (escribe 'salir' para terminar):");
        cadena = sc.nextLine();

        while (!cadena.equalsIgnoreCase("salir")) {
            contadorcadenas++;

            if (cadena.length() > cadenamaslarga.length()) {
                cadenamaslarga = cadena;
            }

            cadena = sc.nextLine();
        }

        System.out.println("Número de cadenas ingresadas: " + contadorcadenas);
        if (contadorcadenas > 0) {
            System.out.println("La cadena más larga es: " + cadenamaslarga);
        } else {

            System.out.println("No se ingresaron cadenas.");
        }
    }
}