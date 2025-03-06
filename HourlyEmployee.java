import BookCode.Date;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        // if wage is invalid throw exception
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;

        // if hours is invalid throw exception
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }
    
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }
    
    public double getWage() {
        return wage;
    }
    
    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }

        this.hours = hours;
    }
    
    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
    
        return wage * hours;
    
    }

    
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s %s %s %s", "hourly employee: ", 
        super.toString(), "wage", getWage(), "hours", getHours(), "earnings", earnings(), "paid", getPay());
    
    }

}


