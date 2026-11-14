
package employee;

import java.util.Objects;

// Ստեղծում ենք Employee դասը
public class Employee {

    // Աշխատակցի տվյալները
    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private String company;
    private String position;

    // Դատարկ կոնստրուկտոր
    public Employee() {
    }

    // Կոնստրուկտոր բոլոր տվյալների համար
    public Employee(String name, String surname, String employeeID,
                    double salary, String company, String position) {

        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    // Getter և Setter մեթոդներ

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Վերասահմանում ենք toString() մեթոդը
    @Override
    public String toString() {
        return "Name: " + name +
                "\nSurname: " + surname +
                "\nEmployee ID: " + employeeID +
                "\nSalary: " + salary +
                "\nCompany: " + company +
                "\nPosition: " + position;
    }

    // Վերասահմանում ենք equals() մեթոդը
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee employee = (Employee) obj;

        return employeeID != null &&
                employeeID.equals(employee.employeeID);
    }

    // Վերասահմանում ենք hashCode() մեթոդը
    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }
}
