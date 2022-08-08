import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleClock extends Thread {
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Override
        public void run() {
        while (true) {
            Calendar calendar = Calendar.getInstance();
            System.out.println(dateFormat.format(calendar.getTime()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The clock was stopped");
                break;
            }
        }
    }
}
