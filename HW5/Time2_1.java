// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.

/*
 8.5
for the Time2 class of Fig. 8.5 to represent the time internally as the number of seconds since mid-
night rather than the three integer values hour, minute and second. Clients could use the same pub-
1ic methods and get the same results. Modify the Time2 class of Fig. 8.5 to implement the time as
the number of seconds since midnight and show that no change is visible to the clients of the class.

(Modifying the Internal Data Representation of a Class) It would be perfectly reasonable
 */

 public class Time2_1 {
    private int secondsSinceMidnight;

    public Time2_1() {
        this.secondsSinceMidnight = 0;
    }

    public Time2_1(int hours) {
        this.secondsSinceMidnight = hours * 3600;
    }
    public Time2_1(int hours, int minutes) {
        this.secondsSinceMidnight = hours * 3600 + minutes * 60;
    }

    public Time2_1(int hours, int minutes, int seconds) {
        if (hours < 0 || hours >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.secondsSinceMidnight = hours * 3600 + minutes * 60 + seconds;
    }


    // Time2 constructor: another Time2 object supplied
    public Time2_1(Time2_1 time) {
        this.secondsSinceMidnight = time.secondsSinceMidnight;
    
}


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

        this.secondsSinceMidnight = hour * 3600 + minute * 60 + second;
    }


    public int getSecondsSinceMidnight() {
        return secondsSinceMidnight;  
    }
    
    public String toUniversalString() {
        return String.format("%02d, seconds since midnight", getSecondsSinceMidnight());
    }

}