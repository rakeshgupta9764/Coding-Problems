/*
	Write a program that uses regular expressions to check whether the input string is a valid vehicle registration number.

    A vehicle registration number has the following format: ?***??, where ? – a Latin symbol from the set [A, B, E, K, M, H, O, P, C, T, Y, X], and * – any digit from 0 to 9.

    The program should output true or false.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        System.out.println(regNum.matches("[ABEKMHOPCTYX]\\d\\d\\d[ABEKMHOPCTYX]{2}"));
    }
}
