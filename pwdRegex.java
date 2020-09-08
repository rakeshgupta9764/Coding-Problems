// The password is hard to crack if it contains at least one uppercase letter, at least one lowercase letter, at least one digit and includes 12 or more symbols. For a given string you should output "YES" if this password is hard to crack, otherwise output "NO".

// Hint: Note that it's convenient to complete this task by using several separate regexes.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String uppercaseRegex = ".*[A-Z].*";
        String lowercaseRegex = ".*[a-z].*";
        String digitRegex = ".*\\d.*";
        String minLenRegex = ".{12,}";
        String ans;
        if (input.matches(uppercaseRegex) && input.matches(lowercaseRegex)
            && input.matches(digitRegex) && input.matches(minLenRegex)) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        System.out.println(ans);
    }
}
