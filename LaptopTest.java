
public class LaptopTest {
	public static void main(String[]args) {
		
		Laptop laptop1 = new Laptop("Apple", 1500, 2005);
			
			System.out.println(laptop1.laptopBrand);
			
			Laptop laptop2= new Laptop("HP", 10000, 2000);
			
			System.out.println(laptop2.laptopBrand);
			
			laptop2.laptopBrand= "Dell";
			System.out.println(laptop2.laptopBrand);
		}
}
