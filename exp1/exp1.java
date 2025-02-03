import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        // 2D array containing employee details:
        // {Employee ID, Name, Joining Date, Designation Code, Department, Basic, HRA, IT}
        String[][] employees = {
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "01/01/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

        // Create a Scanner object for reading input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();
        boolean found = false;

        // Loop through each employee record in the array
        for (String[] emp : employees) {
            // Check if the current record's Employee ID matches the user input
            if (emp[0].equals(empId)) {
                found = true; // Employee found

                // Extract employee details from the array
                String empNo = emp[0];
                String empName = emp[1];
                String department = emp[4];
                String desigCode = emp[3];
                int basic = Integer.parseInt(emp[5]);
                int hra = Integer.parseInt(emp[6]);
                int it = Integer.parseInt(emp[7]);

                // Determine designation and Dearness Allowance (DA) based on the designation code
                String designation = "";
                int da = 0;
                switch (desigCode) {
                    case "e":
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case "c":
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case "k":
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case "r":
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case "m":
                        designation = "Manager";
                        da = 40000;
                        break;
                    default:
                        System.out.println("Invalid designation code.");
                        scanner.close();
                        return; // Exit the program if the designation code is invalid
                }

                // Calculate the total salary
                int salary = basic + hra + da - it;

                // Print the header for the output
                System.out.printf("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary\n");
                // Print the employee details in formatted columns using format specifiers:
                // %s is used for strings and %d for integers. \t adds a tab space.
                System.out.printf("%s\t%s\t%s\t%s\t%d\n", empNo, empName, department, designation, salary);
                break; // Since we found the employee, we can exit the loop
            }
        }

        // If no matching employee is found, display a message
        if (!found) {
            System.out.println("There is no employee with empid: " + empId);
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
