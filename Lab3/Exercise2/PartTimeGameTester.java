public class PartTimeGameTester extends GameTester{
    public PartTimeGameTester(String name)
    {
        super(name,false);
    }

    @Override
    public double determineSalary(int hours) {
        return 20*hours;
    }
}
