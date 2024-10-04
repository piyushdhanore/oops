public class Pizza 
{
    String brand;
    String type;
    double price;
    String location;
    
    Pizza()
    {
        System.out.println("from pizza constructor");
    }

    {
        System.out.println("from Domino's");
    }

    public void displayPizza()
    {
        System.out.println(brand);
        System.out.println(type);
        System.out.println(price);
        System.out.println(location);
    }
}
