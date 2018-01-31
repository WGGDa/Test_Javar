
public class CarTest {

	public static void main(String[]args) {
		
	Car car1 = new Car("Ford", 1500, 1992);
		
		System.out.println(car1.carBrand);
		
		Car car2= new Car("Toyota", 10000, 2000);
		
		System.out.println(car2.carBrand);
		
		car2.carBrand= "Nissan";
		System.out.println(car2.carBrand);
	}
}
