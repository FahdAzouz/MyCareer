package notification;

import java.util.GregorianCalendar;

public class Notification {
    public GregorianCalendar Date_time;
    public String Text;

    public Notification(GregorianCalendar Date_time, String Text){
        this.Date_time = Date_time;
        this.Text = Text;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "Date_time=" + Date_time +
                ", Text='" + Text + '\'' +
                '}';
    }
}
