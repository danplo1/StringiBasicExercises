import java.awt.*;
import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 25.04.2018.
 */
public class Task10 {
    public static void main(String[] args) {

        System.out.println("Podaj hasło do trzykrotnego powtórzenia: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();


        System.out.println(word+" "+word+" "+word);
    }
}
