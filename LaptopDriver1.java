public class LaptopDriver1 {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		System.out.println(l1);
		l1.showLaptopDetails();	
		
		System.out.println("-----------");
		
		Laptop l2 = new Laptop();
		System.out.println(l2);
		l2.brand = "Lenovo";
		l2.processor = "i5";
		l2.ram = 8;
		l2.rom = 1;
		l2.color = "black";
		l2.display = "oled";
		l2.software = "windows";
		l2.showLaptopDetails();

	}

}
