import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 17.04.2018.
 */
public class Task7 {
    //Odczytaj wyraz i na ekranie wypisz Hello Nazwa Wyrazu (odzielone spacją).//

    public static void main(String[] args) {

        System.out.println("Podaj wyraz: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();


        System.out.println("Hello " + word);
    }
}
