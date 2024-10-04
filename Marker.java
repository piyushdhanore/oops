public class Marker 
{
	final String brand = "Camlin";
	double price;
	String color;
	String type;
	int nib;
	
	public void showMakerDetails()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("Type: "+type);
		System.out.println("Thickness: "+nib);
		
		System.out.println("---------------------");
	}
}
