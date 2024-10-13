public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term)
    {
        super(mortgageNumber, customerName, mortgageAmount, primeRate+1, term);
    }

    @Override
    public void getMortgageInfo()
    {
        System.out.println("Business Mortgage - Number: " + mortgageNumber + ", Customer: " + customerName +
                ", Amount: " + mortgageAmount + ", Interest Rate: " + mortgageRate + ", Term: " + term + " years");
    }
}
