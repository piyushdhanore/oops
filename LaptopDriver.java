public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		System.out.println(l1);
		System.out.println(l1.brand);
		System.out.println(l1.processor);
		System.out.println(l1.price);
		System.out.println(l1.ram);
		System.out.println(l1.rom);
		System.out.println(l1.color);
		System.out.println(l1.display);
		System.out.println(l1.software);
		// System.out.println(l2.brand);
		// here you can't print l2.brand because the variable is not created
		// since JVM check or goes from line to line, you can't go for l2.brand
		
		System.out.println("------------");

		Laptop l2 = new Laptop();
		System.out.println(l2);
		l2.brand = "Lenovo";
		l2.processor = "i5";
		l2.ram = 8;
		l2.rom = 1;
		l2.price = 65000.00;
		l2.color = "black";
		l2.display = "oled";
		l2.software = "windows";
		l1.color = "yellow";
		
		System.out.println(l2.brand);
		System.out.println(l2.price);
		System.out.println(l2.processor);
		System.out.println(l2.ram);
		System.out.println(l2.rom);
		System.out.println(l2.color);
		System.out.println(l2.display);
		System.out.println(l2.software);
		System.out.println(l1.color);
		// 
		
	}
}
