package timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new MyTask();
        Calendar cal = Calendar.getInstance();
        cal.set(2022, 9, 21,21,38);
        Date dt = cal.getTime();
        System.out.println("Set time is "+dt);
        timer.schedule(task,dt);
    }
}
