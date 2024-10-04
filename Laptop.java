public class Laptop {

	int ram;
	String brand;
	int rom;
	double price;
	String processor;
	String color;
	String display;
	String software;
	
	public void showLaptopDetails()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("Rom: "+rom);
		System.out.println("Display: "+display);
		System.out.println("Processor: "+processor);
		System.out.println("Ram: "+ram);
		System.out.println("Software: "+software);
	}
}
