public class ACDriver {
	
	public static void main(String[] args) {
		
		AirConditioner a1 = new AirConditioner();
		
		a1.brand = "Blue Star";
		a1.price = 450000.00;
		a1.color = "White";
		a1.type = "Commercial";
		a1.ambient = 22;
		a1.maxTemp = 30;
		a1.minTemp = 15;
		a1.capacity = 12;
		
		a1.showDetails();
		a1.showAmbientTemp();
		a1.showMaxTemp();
		a1.showMinTemp();
		
		a1.increaseTemp();
		a1.showAmbientTemp();
		System.out.println("--------------------");
		
		AirConditioner a2 = new AirConditioner();
		
		a2.brand = "LG";
		a2.price = 350000.00; 
		a2.color = "Blue";
		a2.type = "Personal";
		a2.ambient = 21;
		a2.maxTemp = 32;
		a2.minTemp = 10;
		a2.capacity = 1;
		
		a2.showDetails();
		a2.showAmbientTemp();
		a2.showMaxTemp();
		a2.showMinTemp();
		
		a2.increaseTemp();
		a2.showAmbientTemp();
	}
}
