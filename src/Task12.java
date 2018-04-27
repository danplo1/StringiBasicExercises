import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 25.04.2018.
 */
public class Task12 {
    //*Odczytaj wyraz i zamień * pustym ciągiem.
    //Przykładowo dla ciągu znaków a*bcd ma być wypisany wyraz abcd.

    public static void main(String[] args) {
        System.out.println("Podaj wyraz z gwiazdką: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        System.out.println(word.replace("*",""));




    }
}
