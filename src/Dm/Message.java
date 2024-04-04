package Dm;

import java.util.GregorianCalendar;

public class Message {

    java.util.GregorianCalendar Date = new GregorianCalendar();
    public String Message;

    public Message(GregorianCalendar Date, String Message ){
        this.Date = Date;
        this.Message = Message;
    }

    @Override
    public String toString() {
        return "Dm.Message{" +
                "Date=" + Date +
                ", Dm.Message='" + Message + '\'' +
                '}';
    }
}
