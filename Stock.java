public class Stock{
    private double price;
    private String name;
    Stock(double price ,String name)
    {
        this.price=price;
        this.name=name;
    }
    public String toString()
    {
        return String.format("%s\t%.0f",getName(),getPrice());
    }
    public double getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
}
