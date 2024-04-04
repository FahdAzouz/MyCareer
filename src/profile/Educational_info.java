package profile;

public class Educational_info {
    public String Discipline;
    public int Grade_year;
    public latestDegree Degree;
    public int years;

    public Educational_info (String Discipline, int Grade_year, int years){
        this.Discipline = Discipline;
        this.Grade_year = Grade_year;
        this.years = years;
    }

    public void Update_edu_info( String new_Discipline, int new_Grade_year, int new_years){
       this.Discipline = new_Discipline;
       this.Grade_year = new_Grade_year;
       this.years = new_years;
    }

    public void setLatestDegree(){
            if (this.years >= latestDegree.DOCTORATE.years) //10
                Degree = latestDegree.DOCTORATE;
            else if (this.years >= latestDegree.MASTER.years) //7
                Degree = latestDegree.MASTER;
            else if (this.years >= latestDegree.BACHELOR.years) //4
                Degree = latestDegree.BACHELOR;
            else if (this.years >= latestDegree.ASSOCIATE.years) //2
                Degree = latestDegree.ASSOCIATE;
            else
                Degree = latestDegree.noDegree;
        }

    @Override
    public String toString() {
        return "profile.Educational_info{" +
                "Latest Degree='" + Degree + '\'' +
                ", Discipline='" + Discipline + '\'' +
                ", Graduation year=" + Grade_year +
                '}';
    }
}
