
package employee;

import java.util.Scanner;

// Ստեղծում ենք EmployeeDemo դասը
public class EmployeeDemo {

    // Ծրագրի մուտքի կետը
    public static void main(String[] args) {

        // Ստեղծում ենք Scanner օբյեկտը
        Scanner scanner = new Scanner(System.in);

        // Ստեղծում ենք EmployeeStorage օբյեկտը
        EmployeeStorage storage = new EmployeeStorage();

        // Կառավարում ենք ծրագրի աշխատանքը
        boolean running = true;

        // Ծրագիրը աշխատում է այնքան ժամանակ, մինչև ընտրենք 0
        while (running) {

            // Ցուցադրում ենք մենյուն
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");

            System.out.print("Input: ");

            // Ստանում ենք օգտատիրոջ հրամանը
            String input = scanner.nextLine();

            int command;

            // Ստուգում ենք՝ մուտքագրվածը թիվ է, թե ոչ
            try {
                command = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid command. Please try again.");
                continue;
            }

            // Կատարում ենք ընտրված հրամանը
            switch (command) {

                // 0 - ավարտում ենք ծրագիրը
                case 0:
                    running = false;
                    System.out.println("Program finished.");
                    break;

                // 1 - ավելացնում ենք աշխատակցին
                case 1:

                    System.out.println("Please input employee name:");
                    String name = scanner.nextLine();

                    System.out.println("Please input employee surname:");
                    String surname = scanner.nextLine();

                    System.out.println("Please input employee ID:");
                    String employeeID = scanner.nextLine();

                    double salary;

                    // Ստանում ենք աշխատավարձը
                    while (true) {
                        System.out.println("Please input employee salary:");

                        try {
                            salary = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid salary. Please try again.");
                        }
                    }

                    System.out.println("Please input employee company:");
                    String company = scanner.nextLine();

                    System.out.println("Please input employee position:");
                    String position = scanner.nextLine();

                    // Ստեղծում ենք նոր Employee օբյեկտ
                    Employee employee = new Employee(
                            name,
                            surname,
                            employeeID,
                            salary,
                            company,
                            position
                    );

                    // Ավելացնում ենք աշխատակցին զանգվածում
                    storage.addEmployee(employee);

                    System.out.println("Employee successfully added!");
                    break;

                // 2 - տպում ենք բոլոր աշխատակիցներին
                case 2:
                    storage.printAllEmployees();
                    break;

                // 3 - որոնում ենք աշխատակցին ID-ով
                case 3:

                    System.out.println("Please input employee ID:");
                    String searchID = scanner.nextLine();

                    Employee foundEmployee = storage.searchByID(searchID);

                    if (foundEmployee != null) {
                        System.out.println("Employee found:");
                        System.out.println(foundEmployee);
                    } else {
                        System.out.println(
                                "Employee with ID " + searchID + " not found."
                        );
                    }

                    break;

                // 4 - որոնում ենք ընկերության անունով
                case 4:

                    System.out.println("Please input company name:");
                    String searchCompany = scanner.nextLine();

                    System.out.println("Employees:");
                    storage.searchByCompany(searchCompany);

                    break;

                // Սխալ հրամանի դեպքում
                default:
                    System.out.println("Invalid command. Please try again.");
            }

            System.out.println();
        }

        // Փակում ենք Scanner-ը
        scanner.close();
    }
}
