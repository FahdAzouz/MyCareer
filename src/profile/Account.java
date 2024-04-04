package profile;

public class Account {

    private String Login;
    private String Password;

    public Account(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }

    public String getLogin(){

        return Login;
    }

    public void setLogin(String Login) {

        this.Login = Login;
    }

    public String getPass(){

        return Password;
    }

    public void setPass(String Password) { //used to change password as well

        this.Password = Password;
    }

    public boolean Athenticate(String Password, String Login){ //user input
        if (this.Password.equals(Password) && this.Login.equals(Login))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "profile.Account{" +
                "Login='" + Login + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
