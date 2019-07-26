package loops;

import java.util.Scanner;

public class PowerLoop {
    //    Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
    //    następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana
    //    liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
    //            1
    //            2
    //            4
    //            8
    //            16
    //            32
    //            64
public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    System.out.print("Please, write a integer higher than 0.");
    int digit = scanner.nextInt();

    while( digit <= 0){
        System.out.print(" You wrote wrong digit. Try again.");
        digit = scanner.nextInt();
    }
    int power = 1;
    while( power*2 <= digit){
        System.out.println(power*=2);
    }



}
}
