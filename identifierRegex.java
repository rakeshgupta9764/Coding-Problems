/*
Suppose, you want to create a new programming language that supports variables.

There is a set of rules for identifiers (names) of variables:

It can include lower and upper letters, digits and the underscore character _;
It can only start with a letter or the underscore;
If an identifier starts with the underscore, the second character should be either a letter or a digit, but not the underscore;
Note that a single _ is not a valid identifier.

Using the provided template, write a program that reads n identifiers and then outputs all invalid ones in the same order as they appear in the input data.
Solution without using regex may be possible.
*/
 
// Approach using regex
 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVariables = Integer.parseInt(scanner.nextLine());

        String regex = "(_[a-zA-Z0-9]+\\w*)|([a-zA-Z]\\w*)";    // // we always use \\w* at the end; the regex can be simplified.
                                                                // (but not necessary).

        for (int i = 0; i < numberOfVariables; i++) {
            String identifier = scanner.nextLine();
            if (!identifier.matches(regex)) {
                System.out.println(identifier);
            }
        }
    }
}

