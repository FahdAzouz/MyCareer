package profile;

public enum latestDegree {

    noDegree(0),ASSOCIATE(2), BACHELOR(4), MASTER(7), DOCTORATE(10);
    int years;
    private latestDegree(int years){

        this.years = years;
    }
    public int getYears()
    {
        return years;
    }
}
