import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 16.04.2018.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj imię i nazwisko: ");

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();

        System.out.println("Twoje imię i nazwisko to: " + firstName + " " + lastName);
    }
}
