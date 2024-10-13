abstract class Insurance {
    protected String insuranceType;
    protected double monthlyCost;
    public Insurance(String insuranceType)
    {
        this.insuranceType = insuranceType;
    }
    public String getInsuranceType(String insuranceType)
    {
        return insuranceType;
    }
    public double getMonthlyCost(double monthlyCost)
    {
        return monthlyCost;
    }
    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();

}
