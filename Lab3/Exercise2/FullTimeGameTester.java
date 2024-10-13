public class FullTimeGameTester extends GameTester{
    public FullTimeGameTester(String name)
    {
        super(name,true);
    }

    @Override
    public double determineSalary(int hours) {
        return 3000;
    }
}
