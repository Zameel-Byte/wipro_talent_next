public class Project1 {
    public static void main(String[] args) {
        // Creating arrays to store employee details
        String[] empIds = { "1001", "1002", "1003", "1004", "1005", "1006", "1007" };
        String[] empNames = { "Ashish", "Sushma", "Rahul", "Chathat", "Ranjan", "Suman", "Tanmay" };
        String[] departments = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
        String[] designations_code = { "e", "c", "k", "r", "m", "e", "c" };
        String[] designations = { "Engineer", "Consultant", "Clerk", "Receptionist", "Manager", "Engineer", "Consultant" };
        int[] basic = { 20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
        int[] it = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
        int[] da = { 20000, 32000, 12000, 15000, 40000, 20000, 32000 };


        // Checking if an employee ID is provided as a command-line argument
        if (args.length == 1) {
            String empId = args[0];

            // Searching for the employee ID and displaying details
            int index = -1;
            for (int i = 0; i < empIds.length; i++) {
                if (empIds[i].equals(empId)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("Employee Details:");
                System.out.print("Emp No\t");
                System.out.print("Emp Name\t");
                System.out.print("Department\t");
                System.out.print("Designation\t");
                int salary = basic[index]+hra[index]+da[index]-it[index];
                System.out.println("Salary");
                System.out.print(empIds[index]+"\t");
                System.out.print(empNames[index]+"\t\t");
                System.out.print(departments[index]+"\t\t\t");
                System.out.print(designations[index]+"\t");
                System.out.print(salary);
            } else {
                System.out.println("Employee with ID " + empId + " not found.");
            }
        } else {
            System.out.println("Please provide an employee ID as a command-line argument.");
        }
    }
}
