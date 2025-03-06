import BookCode.Date;

/*  Fig. 9.10: CommissionEmployee.java
CommissionEmployee class uses methods to manipulate its
private instance variables.
*/


public class CommissionEmployee extends Employee {

    protected double grossSales; // gross weekly sales
    protected double commissionRate; // commission percentage

    // five-argument constructor
    public CommissionEmployee(String firstName, String lastName,
        String socialSecurityNumber, Date birthDate, double grossSales,
        double commissionRate) 
    {
        // implicit call to Object constructor occurs here
        super(firstName, lastName, socialSecurityNumber, birthDate);

        // if grossSales is invalid throw exception
        if (grossSales < 0.0) {
        throw new IllegalArgumentException("Gross sales must be >= 0.0"); }

        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
        throw new IllegalArgumentException(
        "Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        }


        // set gross sales amount
        public void setGrossSales(double grossSales) 
        {
            if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0"); }

            this.grossSales = grossSales;
        }

        // return gross sales amount
        public double getGrossSales() {return grossSales;}

        // set commission rate
        public void setCommissionRate(double commissionRate) 
        {
            if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
            }

            this.commissionRate = commissionRate;
        }

        // return commission rate
        public double getCommissionRate() {return commissionRate;}

        // calculate earnings
        @Override
        public double earnings() {
            return getCommissionRate() * getGrossSales();
        }


        // return String representation of CommissionEmployee object
        @Override
        public String toString() {
            return String.format("%s %s %s %s %s %s %s %s %s %s", "Commission employee:\n", super.toString(),
            "\ngross sales", getGrossSales(), "\ncommission rate", getCommissionRate(), "earnings", earnings(), "paid", getPay());
        }
    }