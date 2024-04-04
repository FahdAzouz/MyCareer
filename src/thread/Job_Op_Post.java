package thread;
import java.util.GregorianCalendar;

public class Job_Op_Post extends thread.Post {
    public String job_title;
    public double Salary;
    public GregorianCalendar Start_date;

    public Job_Op_Post(GregorianCalendar Date, String Post, String job_title, double Salary, GregorianCalendar Start_date){
        super(Date, Post);
        this.Salary = Salary;
        this.Start_date = Start_date;
    }

    @Override
    public String toString(){
        return super.toString()+Salary + Start_date;
    }

}
