package profile;

public class Company {
    public String Name;
    public String Description;
    public String Activity;

    public Company(String Name, String Description, String Activity){
        this.Name = Name;
        this.Description = Description;
        this.Activity = Activity;
    }

    @Override
    public String toString() {
        return "profile.Company{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", Activity='" + Activity + '\'' +
                '}';
    }
}
