package by.epam.unit03.class_and_obj.fourth_task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    private Clock(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public void setHours(int hours) {
        if(hours>=0&&hours<24)
            this.hours = hours;
        else
            this.hours = 0;
    }
    public void setMinutes(int minutes) {
        if(minutes>=0&&minutes<60)
            this.minutes = minutes;
        else
            this.minutes = 0;
    }
    public void setSeconds(int seconds) {
        if(seconds>=0&&seconds<60)
            this.seconds = seconds;
        else
            this.seconds = 0;
    }

    
}
