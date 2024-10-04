public class BikeDriver {

	public static void main(String[] args) 
	{
		Bike b1 = new Bike();
		System.out.println("From DriverClass "+b1);
		
		b1.name = "Duke";
		b1.price = 300000;
		b1.color = "orange";
		b1.cc = 390;
		b1.mileage = 25;
		b1.showBikeDetails();
		
		System.out.println("----------------");
		
		Bike b2 = new Bike();
		System.out.println("From DriverClass "+b2);
		
		b2.name = "Honda";
		b2.price = 400000;
		b2.color = "Red";
		b2.cc = 350;
		b2.mileage = 20;
		b2.showBikeDetails();
	}

}
