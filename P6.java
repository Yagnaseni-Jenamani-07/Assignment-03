public class P6 {

    int empId;
    String empName;
    int deptNo;
    double salary;

    public P6(int empId, String empName, int deptNo, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptNo = deptNo;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Department No: " + deptNo);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Error: Please provide exactly 4 arguments:");
            System.out.println("Usage: java Employee <EmpID> <EmpName> <DeptNo> <Salary>");
            return;
        }

        try {
            int empId = Integer.parseInt(args[0]);
            String empName = args[1];
            int deptNo = Integer.parseInt(args[2]);
            double salary = Double.parseDouble(args[3]);

           P6 emp = new P6(empId, empName, deptNo, salary);

            emp.display();
        } catch (NumberFormatException e) {
            System.out.println("Error: Employee ID, Department Number must be integers and Salary must be a valid number.");
        }
    }
}
