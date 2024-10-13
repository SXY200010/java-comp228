public class PersonalMortgage extends Mortgage {
    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term)
    {
        super(mortgageNumber, customerName, mortgageAmount, primeRate+2, term);
    }

    @Override
    public void getMortgageInfo()
    {
        System.out.println("Personal Mortgage - Number: " + mortgageNumber + ", Customer: " + customerName +
                ", Amount: " + mortgageAmount + ", Interest Rate: " + mortgageRate + ", Term: " + term + " years");
    }
}
