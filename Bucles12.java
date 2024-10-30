import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Contar caracteres");
            System.out.println("2. Invertir cadena");
            System.out.println("3. Salir");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce una cadena: ");
                    String cadena = sc.nextLine();
                    System.out.println("Número de caracteres: " + cadena.length());
                    break;
                case 2:
                    System.out.print("Introduce una cadena: ");
                    cadena = sc.nextLine();
                    String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
                    System.out.println("Cadena invertida: " + cadenaInvertida);
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida. Intentelo de nuevo.");
            }
            System.out.println();
        } while (opcion != 3);
    }
}