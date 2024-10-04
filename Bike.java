public class Bike 
{
	String name;
	double price;
	String color;
	int cc;
	int mileage;
	
	public void showBikeDetails()
	{
		String name = "Chapri Bike";
		System.out.println("Name: "+name);
		System.out.println("Name: "+this.name);
		System.out.println(this);
		System.out.println("Price: "+price);
		System.out.println("CC: "+cc);
		System.out.println("Mileage: "+mileage);
		System.out.println("Color: "+color);
		
	}
}
