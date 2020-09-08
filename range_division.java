// Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.

// Note: it is possible to write this program more efficiently without any loops.

// Approach without loops:

class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int result = 0;     // start with zero such numbers which are divisible by n
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        // the first number p such that p >= a and p % n == 0 is obtained as below (formulated by observation):
        int zeroPoint = a % n == 0 ? a : a + (n - a % n);   // think of examples and formulate yourself.
        
        // if the first number divisible by n is in the range [a, b] then:
        if (zeroPoint <= b) {
            // there is at least one x such that x % n == 0 and a <= x <= b.
            // find how many more numbers are divisible by n in the range [zeroPoint, b]; finally add all the counts.
            result += 1 + (b - zeroPoint) / n;
        }
        System.out.println(result);     
    }
}
