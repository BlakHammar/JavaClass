import BookCode.Date;

/*
9.14 (Employee Hierarchy) In this chapter, you studied an inheritance hierarchy in which class
BasePlusCommissionEmployee inherited from class CommissionEmployee. However, not all types of
employees are CommissionEmployees. In this exercise, you'll create a more general Employee superclass
that factors out the attributes and behaviors in class CommissionEmployee that are common to all Em-
ployees. The common attributes and behaviors for all Employees are firstName, lastName,
socialSecurityNumber, getFirstName, getLastName, getSocialSecurityNumber and a portion of
method toString. Create a new superclass Employee that contains these instance variables and meth-
ods and a constructor. Next, rewrite class CommissionEmployee from Section 9.4.5 as a subclass of Em-
ployee. Class CommissionEmployee should contain only the instance variables and methods that are
not declared in superclass Employee. Class CommissionEmployee's constructor should invoke class Em-
ployee's constructor, and CommissionEmployee's toString method should invoke Employee's to-
String method. Once you've completed these modifications, run the CommissionEmployeeTest and
BasePlusCommissionEmployeeTest apps using these new classes to ensure that the apps still display the
same results for a CommissionEmployee object and BasePlusCommissionEmployee object, respectively.
 */

public class Employee {
    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    private final Date birthDate;
    protected double pay;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getMonth()
    {
        return birthDate.getMonth();
    }


    public double earnings() {
        return 0;
    }

    public double setPay(double pay) {
        this.pay = earnings() + pay;
        return this.pay;
    }
    
    public double getPay() {
        return pay;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s%s %s%s", firstName, lastName, "\nSN: ", socialSecurityNumber, 
        "\nBD: ", birthDate);
    }


    /*
    10.13 (Payroll System Modification) Modify the payroll system of Figs. 10.4-10.9 to include
private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an em-
ployee's birthday. Add get methods to class Date. Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person's
payroll amount if the current month is the one in which the Employee's birthday occurs.
    */
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new CommissionEmployee("Sue", "Jones", "222-22-2222",
        new Date(8, 12, 2000) , 10000, .06);

        employees[1] = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 
        new Date(9, 28, 2000), 5000, .04, 300);

        employees[2] = new HourlyEmployee("Janet", "Smith", "444-44-4444", 
        new Date(10, 15, 2000), 20.50, 40);

        int currentMonth = 10;


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getMonth() == currentMonth) 
            {
                employees[i].setPay(100);
            }
            else{
                employees[i].setPay(0);
            }
            System.out.println(employees[i].toString());
        }
    
        
    }
}



