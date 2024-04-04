package profile;

public class Profile {

    public String Name;
    public int Age;
    public String Adress;
    public String Email;
    public String Phone;

    public Profile(String Name, int Age, String Adress, String Email, String Phone){
        this.Name = Name;
        this.Age=Age;
        this.Adress=Adress;
        this.Email=Email;
        this.Phone=Phone;
    }

    public void Update_profile(String NewName, int NewAge, String NewAdress, String NewEmail, String NewPhone){ //user input
        Name = NewName;
        Age = NewAge;
        Adress = NewAdress;
        Email = NewEmail;
        Phone = NewPhone;
    }

    @Override
    public String toString() {
        return "profile.Profile{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Adress='" + Adress + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
