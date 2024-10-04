public class AirConditioner {
	
	String brand;
	double price;
	String color;
	int capacity;
	int ambient;
	int maxTemp;
	int minTemp;
	String type;
	
	public void increaseTemp()
	{
		if (ambient<maxTemp) {
			ambient++;
		} 
		else {
			System.out.println("Maximum temperature reached");
		}
	}
	
	public void decreaseTemp()
	{
		if (ambient>minTemp) {
			ambient--;
		} 
		else {
			System.out.println("Minimum temperature reached");
		}
	}
	
	public void showAmbientTemp()
	{
		System.out.println("Ambient Temperature: "+ambient+"˚c");
	}
	
	public void showMaxTemp()
	{
		System.out.println("Maximun Temperature: "+maxTemp+"˚c");
	}
	
	public void showMinTemp()
	{
		System.out.println("Minimum Temperature: "+minTemp+"˚c");
	}
	
	public void showDetails()
	{
		System.out.println("Brand :"+brand);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("Type: "+type);
		System.out.println("Capacity: "+capacity+"tonnes");
	}
	
}
