package loops;

//Napisać program, który wczytuje liczby podawane przez użytkownika dotąd,
// dopóki nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych liczb.

import java.util.Scanner;

public class SetOfDigitsWith0Ending {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int digitMin = 100000000;
        int digitMax = -100000000;
        int digitSum = 0;
        int digitArithmetic = 0;
        int counter = 1;
        int digit1 = 1;

        do {
            System.out.println("Please, write first integer. You can stop writing integers - press 0.");
            int digit2 = sc.nextInt();
            if (digit2 != 0) {
                digitMin = Math.min(digitMin, digit2);
                digitMax = Math.max(digitMax, digit2);
                digitSum += digit2;
                digitArithmetic = digitSum / counter;

                counter++;

            } else
                digit1 = digit2;


        }
        while (digit1 != 0);

        System.out.println("Min " + digitMin);
        System.out.println("Max " + digitMax);
        System.out.println("Sum " + digitSum);
        System.out.println("Arithemtic " + digitArithmetic);
    }
}


