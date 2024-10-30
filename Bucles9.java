import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int N = sc.nextInt();
        int sumaPares = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }

        System.out.println("La suma de los números pares desde 1 hasta " + N + " es: " + sumaPares);
    }
}