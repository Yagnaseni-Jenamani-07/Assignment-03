public class P5 {
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please enter exactly two numbers as command-line arguments.");
            System.out.println("Usage: java GCD <num1> <num2>");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int result = gcd(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");
        }
    }
}
