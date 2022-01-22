public class OrderAudi implements OrderCar {
 
    @Override
    public void makeOrder()
    {
        System.out.println("Ordering an Audi Car. ");
    }
private static OrderAudi obj;
    
    private OrderAudi() {}
 
    public static synchronized OrderAudi getInstance()
    {
        if (obj==null)
            obj = new OrderAudi();
        return obj;
    }
}