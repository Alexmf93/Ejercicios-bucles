import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        int contadorpalabras = 0;
        boolean palabra = false;


        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);


            if (caracter == ' ') {
                palabra = false;
            } else if (!palabra) {

                palabra = true; 
                contadorpalabras++;
            }
        }

        System.out.println("Número de palabras: " + contadorpalabras);
    }
}