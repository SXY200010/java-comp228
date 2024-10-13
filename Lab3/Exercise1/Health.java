public class Health extends Insurance {
    public Health()
    {
        super("Health Insurance");
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
