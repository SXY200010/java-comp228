public class Life extends Insurance{
    public Life()
    {
        super("Life Insurance");
    }
    @Override
    public void setInsuranceCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + insuranceType + ", Monthly Cost: " + monthlyCost);
    }
}
