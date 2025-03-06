public class HourlyEmployeeTest {

    public static void main(String[] args) {
        // instantiate HourlyEmployee object
        HourlyEmployee employee = new HourlyEmployee(
            "Sue", "Jones", "222-22-2222", 15.50, 50);

        // get commission employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Wage is", employee.getWage());
        System.out.printf("%s %.2f%n", "Hours is", employee.getHours());
        System.out.printf("%s %.2f%n", "Gross pay is", employee.earnings());

        employee.setWage(19.50);
        employee.setHours(40);

        System.out.printf("%n%s:%n%n%s%n",
            "Updated employee information obtained by toString", employee);
    }
    
}
