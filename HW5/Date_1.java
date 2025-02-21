// Fig. 8.7: Date.java
// Date class declaration.
public class Date_1 {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth = 
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // constructor: confirm proper value for month and day given the year
    public Date_1(int month, int day, int year) {
        // check if month in range
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                "month (" + month + ") must be 1-12");
        }

        // check if day in range for month
        if (day <= 0 || 
            (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day +
                ") out-of-range for the specified month and year");
        }

        // check if year in range
        if (year < 0) {
            throw new IllegalArgumentException(
                "year (" + year + ") must be >= 0");
        }   

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && 
            !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +
                ") out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    public void boundaryFix() {
        if(this.day > Date_1.daysPerMonth[this.month])
        {
            this.day = 1;
            this.month += 1;
        }

        if(this.month > 12)
        {
            this.month = 1;
            this.year += 1;
        } 

    }

    //Increments

    public void nextDay() {
        this.day = this.day + 1;
        boundaryFix();
    }



    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }


    public static void main(String[] args) {
        Date_1 d1 = new Date_1(11, 30, 2025);
        System.out.println(d1.toString());

        int counter = 0;

        while (counter < 35) 
        {
            d1.nextDay();
            System.out.println("After incrementDay: ");
            System.out.println(d1.toString());
            System.out.println("----------------------");
            counter++;
        }   

    }
}
