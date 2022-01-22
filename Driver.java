import java.io.ObjectInputStream.GetField;

public class Driver {
	
	public static void main (String []args)
	{
		CarFactory obj = CarFactory.getInstance();
		OrderCar car = obj.submitOrder("Mercedes");
		car.makeOrder();
		car = obj.submitOrder("Audi");
		car.makeOrder();
		car = obj.submitOrder("BMW");
		car.makeOrder();
		
	}

}
