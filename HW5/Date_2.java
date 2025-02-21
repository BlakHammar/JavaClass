/*
8.15

(Date Class) Create class Date with the following capabilities:
a) Output the date in multiple formats, such as
MM/DD/YYYY
June 14, 1992
DDD YYYY

b) Use overloaded constructors to create Date objects initialized with dates of the formats
in part (a). In the first case the constructor should receive three integer values. In the
second case it should receive a String and two integer values. In the third case it should
receive two integer values, the first of which represents the day number in the year.
*/

import java.util.Arrays;

public class Date_2 {
    private static String[] months =
        { "blank ", "January", "February", "March", "April", "May", "June", "July", 
        "August", "September", "October", "November", "December" };



    private String monthName;
    private int month; // 1-12
    private int day; // 1-31 based on month,
    private int dayOfYear; // 1-366 based on year
    private int year; // any year

    private static final int[] daysPerMonth = 
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    

    // constructor: month number, day, year
    public Date_2(int month, int day, int year) {
        
        this.month = month;
        this.day = day;
        this.year = year;
        this.dayOfYear = 0;

        // check if month in range
        checkBoundary();
    }

    // constructor: month name, day, year
    public Date_2(String month, int day, int year) 
    {
        for(String data : months) 
        {
            if(data.equals(month))
            {
                monthName = month;
            }
        }
        this.day = day;
        this.year = year;
        this.dayOfYear = 0;

        this.month = Arrays.asList(months).indexOf(monthName);

        // check if month in range
        checkBoundary2();
    }

    // constructor: day number, year
    public Date_2(int dayOfYear, int year) 
    {
        this.dayOfYear = dayOfYear;
        this.year = year;

        // check if month in range
        checkBoundary3();
    }




    private void checkBoundary()
    {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month must be 1-12");
        }
        if (day <= 0 || day > daysPerMonth[month]) {
            throw new IllegalArgumentException("Day is out of range for the given month");
        }

    }

    private void checkBoundary2()
    {
        if (monthName == null) {
            throw new IllegalArgumentException("Month name must not be null");
        }
        
    }

    private void checkBoundary3()
    {
        if(dayOfYear <= 0 || dayOfYear > 366) 
        {
            throw new IllegalArgumentException("Day is out of range for the given year");
        }
        if(year < 0) 
        {
            throw new IllegalArgumentException("Year must be >= 0");
        }   
    }




    // Overloaded toString

    @Override
    public String toString() {
        if(dayOfYear > 0)
        {
            return String.format("%d %d", dayOfYear, year);
        } else if (monthName != null) 
        {
            return String.format("%s %02d, %d", monthName, day, year); // Month DD, YYYY format
        } else 
        {
            return String.format("%02d/%02d/%d", month, day, year); // Default MM/DD/YYYY format
        }
    }

    public static void main(String[] args) {
        Date_2 date1 = new Date_2(6, 14, 1992); // MM/DD/YYYY
        Date_2 date2 = new Date_2("June", 14, 1992); // Month DD, YYYY
        Date_2 date3 = new Date_2(165, 1992); // DDD YYYY

        // Test the same toString() method that returns different formats
        System.out.println("Date1 (MM/DD/YYYY): " + date1.toString()); // Default toString
        System.out.println("Date2 (Month DD, YYYY): " + date2.toString()); // Month DD, YYYY
        System.out.println("Date3 (DDD YYYY): " + date3.toString()); // DDD YYYY
    }








}