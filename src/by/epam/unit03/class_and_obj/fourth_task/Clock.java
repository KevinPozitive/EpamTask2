package by.epam.unit03.class_and_obj.fourth_task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* I have some asks. For example: I can use two threads in this task, but is it necessary?
 first thread will work and use some data(hours, minutes,seconds)
 second thread will wait some date from user, and when hi will input data
 second thread stopped first thread, update data, and after will free second thread.
 Maybe have simpler and more logical solution but I have not used threads and synchronize
 of threads for a long time, need to remember.
 */

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    private Clock(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    protected Clock(int hours,int minutes,int seconds){
        if(hours>=0&&hours<24)
            this.hours = hours;
        else
            this.hours = 0;

        if(minutes>=0&&minutes<60)
            this.minutes = minutes;
        else
            this.minutes = 0;

        if(seconds>=0&&seconds<60)
            this.seconds = seconds;
        else
            this.seconds = 0;
    }

    protected void setHours(int hours) {
        if(hours>=0&&hours<24)
            this.hours = hours;
        else
            this.hours = 0;
    }
    protected void setMinutes(int minutes) {
        if(minutes>=0&&minutes<60)
            this.minutes = minutes;
        else
            this.minutes = 0;
    }
    protected void setSeconds(int seconds) {
        if(seconds>=0&&seconds<60)
            this.seconds = seconds;
        else
            this.seconds = 0;
    }
}
