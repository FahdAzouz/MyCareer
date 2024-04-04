package thread;

public class Form {

    public String Education;
    public String Experience;
    public String Skills;
    public int credits;

    public Form (String Education, String Experience, String Skills, int credits){
        this.credits = credits;
        this.Skills = Skills;
        this.Experience = Experience;
    }

    @Override
    public String toString() {
        return "thread.Form{" +
                "Education='" + Education + '\'' +
                ", Experience='" + Experience + '\'' +
                ", Skills='" + Skills + '\'' +
                '}';
    }
}
