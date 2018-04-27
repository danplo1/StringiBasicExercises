import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 17.04.2018.
 */
public class Task8 {

    //Odczytaj wyraz i wypisz 2 ostatnie litery wyrazu.//

    public static void main(String[] args) {

        System.out.println("Podaj wyraz: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int length = word.length();
        System.out.println("Przedostatnia litera to: " + word.charAt(length-2) + " ,ostatnia litera to: "
        + word.charAt(length-1));
        //System.out.println(word.charAt(0));//

    }

}
