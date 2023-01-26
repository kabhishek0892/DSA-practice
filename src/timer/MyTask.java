package timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("I am getting executed as per the scheduled time at "+new Date());
    }
}
