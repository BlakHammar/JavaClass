/*
 8.7
(Enhancing Class Time2) Modify class Time2 of Fig. 8.5 to include a tick method that increments 
the time stored in a Time2 object by one second. Provide method incrementMinute to increment
 the minute by one and method incrementHour to increment the hour by one. Write a
program that tests the tick method, the incrementMinute method and the incrementHour method
to ensure that they work correctly. Be sure to test the following cases:
a) incrementing into the next minute,
b) incrementing into the next hour and
c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).

 */
public class Time2_2 {
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Time2 no-argument constructor: initializes each instance variable to zero
    public Time2_2() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2_2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2_2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour, minute, and second supplied
    public Time2_2(int hour, int minute, int second) {
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

    // Time2 constructor: another Time2 object supplied
    public Time2_2(Time2_2 time) {
        // invoke constructor with three arguments
        this(time.hour, time.minute, time.second);
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

    //Increments

    public void tick() {
        if(this.second < 59) {
            this.second++;
        } else {
            this.second = 0;
            if (this.minute < 59) {
                this.minute++;
            } else {
                this.minute = 0;
                if (this.hour < 23) {
                    this.hour++;
                } else {
                    this.hour = 0;
                }
            }
        }
    }

    public void incrementMinute() {
        if (this.minute < 59) {
            this.minute++;
        } else {
            this.minute = 0;
            if (this.hour < 23) {
                this.hour++;
            } else {
                this.hour = 0;
            }
        }
    }

    public void incrementHour() {
        if (this.hour < 23) {
            this.hour++;
        } else {
            this.hour = 0;
        }
    }   


    // Get Methods

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

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)

    public String toString() {
        return String.format("%d:%02d:%02d %s", 
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }



    public static void main(String[] args) {

        Time2_2 time = new Time2_2(22, 58, 58);
        System.out.println("Initial universal time: " + time.toUniversalString());
        System.out.println("Initial standard time: " + time);

        time.tick();
        System.out.println("After tick: " + time.toUniversalString());
        System.out.println("After tick: " + time);

        time.incrementMinute();
        System.out.println("After incrementMinute: " + time.toUniversalString());
        System.out.println("After incrementMinute: " + time);

        time.incrementHour();
        System.out.println("After incrementHour: " + time.toUniversalString());
        System.out.println("After incrementHour: " + time);

        time.tick();
        System.out.println("After tick: " + time.toUniversalString());
        System.out.println("After tick: " + time);
        


    }
    
}
