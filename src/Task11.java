import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 25.04.2018.
 */
public class Task11 {
    public static void main(String[] args) {

        System.out.println("Podaj wyraz do przetworzenia na małe litery (użyj CAPS LOCK-a):" );
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(word.toLowerCase());

    }
}
