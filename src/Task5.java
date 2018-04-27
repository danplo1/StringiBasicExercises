import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 16.04.2018.
 */
public class Task5 {
    //Napisz program, który odczytuje wyraz. Twoim zadaniem jest wypisanie przedostatniej litery wyrazu.//

    public static void main(String[] args) {
        System.out.println("Podaj wyraz:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        // Daniel//
        //012345//
        int length = word.length();
        System.out.println("Przedostatnia litera to: " + word.charAt(length-2));
        System.out.println(word.charAt(0));


        StringBuilder lastName = new StringBuilder("Płócienniczak");
        lastName.reverse();

        // do modyfikacji//
    }
}

