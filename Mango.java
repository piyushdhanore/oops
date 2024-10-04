public class Mango 
{
	String location;
	String color;
	double price;
	String type;

	Mango()
	{
		
	}
	
	public Mango showLocation()
	{
		System.out.println(location);
		return this;
	}

	public Mango showType()
	{
		System.out.println(type);
		return this;
	}

	public Mango showPrice()
	{
		System.out.println(price);
		return this;
	}

	public Mango showColor()
	{
		System.out.println(color);
		return this;
	}
}

