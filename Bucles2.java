import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su cadena ");
        String cadena = sc.nextLine();

        System.out.println("¿Que letra quiere contar?");
        char letra = sc.nextLine().charAt(0);

        int contador = 0;


        for (int i = 0; i<cadena.length(); i++){
            if (cadena.charAt(i) == letra){
                contador++;
            }
        }
        System.out.println("Su letra "+letra+ " aparece " +contador+ " veces");
    }
}