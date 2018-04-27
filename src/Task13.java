import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 25.04.2018.
 */
public class Task13 {
    public static void main(String[] args) {

        System.out.println("Podaj wyraz: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(word.endsWith("tka"));
    }
}
