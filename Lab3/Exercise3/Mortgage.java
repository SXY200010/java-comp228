abstract class Mortgage implements MortgageConstants{
    protected int mortgageNumber;
    protected String customerName;
    protected double mortgageAmount;
    protected double mortgageRate;
    protected int term;
    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double mortgageRate, int term)
    {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.mortgageAmount = Math.min(mortgageAmount, maxMortgageAmount);;
        this.mortgageRate = mortgageRate;
        this.term  = (term == shortTerm || term == mediumTerm || term == longTerm) ? term : shortTerm;;
    }
    public abstract void getMortgageInfo();
}
