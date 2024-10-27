public class ScienceBook extends Book {

    public ScienceBook(String title, String ISBN, String publisher, double price, int year)
    {
        super(title, ISBN, publisher,price, year);
        setPrice(price);
    }

    @Override
    public void setPrice(double price)
    {
        this.price = price*(1-0.1);
    }
    public double getPrice()
    {
        return price;
    }

    @Override
    public String getGenre()
    {
        return "Science";
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nGenre: Science\nPrice: " + price;
    }
}
