public class ChildrenBook extends Book {

    public ChildrenBook(String title, String ISBN, String publisher, double price, int year)
    {
        super(title, ISBN, publisher,price, year);
        setPrice(price);
    }

    @Override
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }

    @Override
    public String getGenre()
    {
        return "Children";
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nGenre: Science\nPrice: " + price;
    }
}
