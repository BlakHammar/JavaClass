/*
 8.12 (Date and Time Class) Create class DateAndTime that combines the modified Time2_2 class of
Exercise 8.7 and the modified Date_1 class of Exercise 8.8. Modify method incrementHour to call
method nextDay if the time is incremented into the next day. Modify methods toString and toUni-
versalString to output the date in addition to the time. Write a program to test the new class Date-
AndTime. Specifically, test incrementing the time to the next day.
*/

public class DateAndTime {
    
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth = 
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    public DateAndTime()
    {
        this(1, 1, 2000, 0, 0, 0);
    }

    public DateAndTime(int month, int day, int year)
    {
        this(month, day, year, 0, 0, 0);
    }

    public DateAndTime(int month, int day, int year, 
    int hour) {
        this(month, day, year, hour, 0, 0);
    }

    public DateAndTime(int month, int day, int year, 
    int hour, int minute) {
        this(month, day, year, hour, minute, 0);
    }

    public DateAndTime(int month, int day, int year, 
    int hour, int minute, int second) {
        if (year < 0) {
            throw new IllegalArgumentException("year must be >= 0");
        }   
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month must be 1-12");
        }

        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("day must be 1-31");
        }
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public DateAndTime(DateAndTime dateAndTime) 
    {
        this(dateAndTime.month, dateAndTime.day, dateAndTime.year,
        dateAndTime.hour, dateAndTime.minute, dateAndTime.second);
    }

    // Set Methods

    // set a new time value using universal time; validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setDate(int month, int day, int year) 
    {
        if(month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                "month must be 1-12");
        }

        if(day <= 0 || 
            (day > DateAndTime.daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day out-of-range for the specified month and year");
        }

        if(year < 0) {
            throw new IllegalArgumentException(
                "year must be >= 0");
        }   

        if (month == 2 && day == 29 && 
            !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day out-of-range for the specified month and year");    

        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Get Methods

    // get month value
    public int getMonth() {
        return month;
    }

    // get day value
    public int getDay() {
        return day;
    }

    // get year value
    public int getYear() {
        return year;
    }

    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // get second value 
    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%d/%d/%d %d:%d:%d", 
        month, day, year, hour, minute, second);
    }   

    public String toString() 
    {
        return String.format("%d/%d/%d %d:%d:%d %s", 
        getMonth(), getDay(), getYear(), ((getHour() == 0 || 
        getHour() == 12) ? 12 : getHour() % 12),
        getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public void boundaryFix() {
        if(this.second > 59)
        {
            this.second = 0;
            this.minute += 1;
        }

        if(this.minute > 59)
        {
            this.minute = 0;
            this.hour += 1;
        }

        if(this.hour > 23)
        {
            this.hour = 0;
            this.day += 1;
        }

        if(this.day > DateAndTime.daysPerMonth[this.month])
        {
            this.day = 1;
            this.month += 1;
        }

        if(this.month > 12)
        {
            this.month = 1;
            this.year += 1;
        } 

        if (this.month == 2 && this.day == 29 && 
            !(this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0))) {
            this.day = 1;
            this.month += 1;
        }


    }

//Increments

public void nextDay() {
    this.day = this.day + 1;
    boundaryFix();
}

public void tick() {
    this.second = this.second + 1;
    boundaryFix();
}

public void incrementMinute() {
    this.minute = this.minute + 1;
    boundaryFix();
}

public void incrementHour() {
    if (this.hour < 23) {
        this.hour++;
    } else 
    {
        this.hour = 0;
        nextDay();
    }
}   

public static void main(String[] args) {

    DateAndTime date = new DateAndTime(12, 31, 2019,
    23, 05, 00);

    System.out.println("Date: " + date.toString());

    date.incrementHour();

    System.out.println("After incrementHour: " + date.toString());

}









    
    
    
    
}
