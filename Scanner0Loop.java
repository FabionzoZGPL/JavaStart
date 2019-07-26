package loops;

import java.util.Scanner;

//Napisać program, który wczytuje liczby podawane przez użytkownika dotąd
//        dopóki nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych liczb.

public class Scanner0Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Please, write a number.");
            number = sc.nextInt();
            sum += number;

        }
        while (number != 0);
        System.out.println(sum);

    }
}
