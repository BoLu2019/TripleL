import java.util.Timer;
import java.util.TimerTask;

public class TimerTT {
    public int secondsPassed = 0;

    Timer myTimer = new Timer();
    TimerTask task = new TimerTask() {
	    public void run() {
		secondsPassed++;
	    }
	};
	public void start() {
	    myTimer.scheduleAtFixedRate(task,1000,1000);
	}

    public static void main(String[] args) {
	TimerTT timer = new TimerTT();
	timer.start();
    }
}
