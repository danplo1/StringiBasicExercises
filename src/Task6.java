import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 17.04.2018.
 */
public class Task6 {

    //Odczytaj wyraz i wypisz pierwszą literę wyrazu.//
    public static void main(String[] args) {
        System.out.println("Podaj wyraz: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        //Joasia//
        //012345//
        int length =word.length();
        System.out.println("Piewsza litera słowa to: " + word.charAt(0));
        System.out.println("Ostatnia litera słowa to: " + word.charAt(length-1));


    }

}
