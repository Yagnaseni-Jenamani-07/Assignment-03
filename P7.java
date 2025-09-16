public class P7 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Error: Please provide exactly 9 arguments.");
            System.out.println("Usage: java StudentAverage <SIC> <Name> <Branch> <Mark1> <Mark2> <Mark3> <Mark4> <Mark5> <Mark6>");
            return;
        }

        try {
            String sic = args[0];
            String name = args[1];
            String branch = args[2];

            double total = 0;
            for (int i = 3; i < 9; i++) {
                double mark = Double.parseDouble(args[i]);
                total += mark;
            }

            double average = total / 6;

            System.out.println("Student Details:");
            System.out.println("SIC: " + sic);
            System.out.println("Name: " + name);
            System.out.println("Branch: " + branch);
            System.out.println("Marks in 6 subjects:");
            for (int i = 3; i < 9; i++) {
                System.out.println("Subject " + (i - 2) + ": " + args[i]);
            }
            System.out.println("Average Marks: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values for the marks.");
        }
    }
}
