public class P4 {

    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two numbers as command-line arguments.");
            System.out.println("Usage: java AddTwoNumbers <num1> <num2>");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int sum = num1 + num2;

            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Both arguments must be valid integers.");
        }
    }
}
