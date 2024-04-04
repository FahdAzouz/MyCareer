import Dm.Message;
import profile.Account;
import profile.Company;
import profile.Educational_info;
import profile.Profile;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        String message;
        String profileType;
        GregorianCalendar gcal = new GregorianCalendar();

        Message m = new Message(gcal, "Hello");
        message = m.toString();
        System.out.println(message);
    //Object 1 -> Account Creation
        System.out.println("Please click on 1 to create an account:");
        Scanner s1 = new Scanner(System.in);
        choice = s1.nextInt();
        System.out.println("Enter a login: ");
        String login = s1.next();
        System.out.println("Enter a password: ");
        String PW = s1.next();
        Account ac1 = new Account(login, PW);
        message = ac1.toString();
        System.out.println(message);

         //Authentication
        System.out.println("        \nLOGIN TO YOUR ACCOUNT :    ");
        System.out.println("Insert Your User Name :");
        String userName = s1.next();
        System.out.println("Insert Your Password :");
        String passWord = s1.next();
        Boolean status = ac1.Athenticate(passWord,userName);

        if (status == true) {
            Scanner s2 = new Scanner(System.in);
            System.out.println("        WELCOME TO MyCareer! \n Would you like to change your password (Y/N) ? :");
            String passchange = s2.next();

            //Change password
            if (passchange.equals("Y")) {
                System.out.println(" Enter new Password");
                String newpass = s1.next();
                ac1.setPass(newpass);
                System.out.println("Your Password has been Changed Successfully!");
                message = ac1.toString();
                System.out.println(message);

            }

            System.out.println("\nEnter 1 for a user profile \nEnter 2 for a company profile ");
            choice = s2.nextInt();
            if(choice == 1) {

    //Object 2 -> Profile Creation
                System.out.println("Enter Name :");
                String Name = s2.next();
                System.out.println("Enter Age :");
                int Age = s2.nextInt();
                System.out.println("Enter Address :");
                String Address = s2.next();
                System.out.println("Enter Email :");
                String Email = s2.next();
                System.out.println("Enter Phone :");
                String Phone = s2.next();
                Profile profil = new Profile(Name, Age, Address, Email, Phone);
                message = profil.toString();
                System.out.println(message);

    // Object 3 -> Educational_info Creation
                System.out.println("To complete your profile creation, fill your educational info");
                Scanner s3 = new Scanner(System.in);
                System.out.println("Discipline :");
                String Discipline = s3.next();
                System.out.println("Graduation year :");
                int year = s3.nextInt();
                System.out.println("Education period :");
                int years = s3.nextInt();
                Educational_info edu_info = new Educational_info(Discipline, year, years);
                edu_info.setLatestDegree();
                message = edu_info.toString();
                System.out.println(message);
            }

    //Object 4 -> Company Profile Creation
            else if(choice == 2) {
                System.out.println("Enter Name :");
                String Name = s2.next();
                System.out.println("Enter Description :");
                String Description = s2.next();
                System.out.println("Enter Activity :");
                String Activity = s2.next();
                Company company = new Company(Name, Description, Activity);
                message = company.toString();
                System.out.println(message);
            }
            else {
                System.out.println("Wrong input! ");
            }
        }
        else
            System.out.println("Wrong username or password");

    }
}


