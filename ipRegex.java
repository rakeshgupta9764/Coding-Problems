// An IP address consists of four numbers from 0 to 255, inclusive, divided by the dots. For example, 127.0.0.1 is a valid IP address, but 256.0.0.1 and 127.0.1 are invalid IP addresses.

// For a given string output "YES" if this string is a valid IP address, otherwise output "NO".

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String regex = "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])";    // represents any number in the range [0, 255] (a byte)
        String expandedRegex = String.join("\\.", regex, regex, regex, regex);
        System.out.println(input.matches(expandedRegex) ? "YES" : "NO");
    }
}
