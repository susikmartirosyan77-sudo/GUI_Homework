
package employee;

// Ստեղծում ենք EmployeeStorage դասը
public class EmployeeStorage {

    // Ստեղծում ենք աշխատակիցների զանգվածը
    private Employee[] employees;

    // Պահում ենք ավելացված աշխատակիցների քանակը
    private int size;

    // Կոնստրուկտոր
    public EmployeeStorage() {
        employees = new Employee[10];
        size = 0;
    }

    // Մեծացնում ենք զանգվածի չափը
    private void extend() {

        Employee[] newEmployees =
                new Employee[employees.length * 2];

        // Հին արժեքները տեղափոխում ենք նոր զանգված
        for (int i = 0; i < employees.length; i++) {
            newEmployees[i] = employees[i];
        }

        // Նոր զանգվածը դարձնում ենք հիմնական
        employees = newEmployees;
    }

    // Ավելացնում ենք աշխատակցին
    public void addEmployee(Employee employee) {

        // Եթե զանգվածը լցվել է, մեծացնում ենք այն
        if (size == employees.length) {
            extend();
        }

        // Ավելացնում ենք աշխատակցին
        employees[size++] = employee;
    }

    // Տպում ենք բոլոր աշխատակիցներին
    public void printAllEmployees() {

        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }

        for (int i = 0; i < size; i++) {

            System.out.println("Employee " + (i + 1) + ":");

            // Կանչում ենք Employee-ի toString() մեթոդը
            System.out.println(employees[i]);

            System.out.println();
        }
    }

    // Որոնում ենք աշխատակցին ID-ով
    public Employee searchByID(String employeeID) {

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeID().equals(employeeID)) {
                return employees[i];
            }
        }

        // Եթե աշխատակիցը չի գտնվել
        return null;
    }

    // Որոնում ենք աշխատակիցներին ընկերության անունով
    public void searchByCompany(String company) {

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (employees[i].getCompany().equalsIgnoreCase(company)) {

                System.out.println(
                        employees[i].getName() + " " +
                                employees[i].getSurname() + " - " +
                                employees[i].getPosition()
                );

                found = true;
            }
        }

        // Եթե համապատասխան աշխատակիցներ չկան
        if (!found) {
            System.out.println(
                    "No employees found for company " + company + "."
            );
        }
    }
}
