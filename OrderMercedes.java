public class OrderMercedes implements OrderCar {
 
    @Override
    public void makeOrder()
    {
        System.out.println("Ordering a Mercedes Car. ");
    }
    
    private static OrderMercedes obj;
    
    private OrderMercedes() {}
 
    public static synchronized OrderMercedes getInstance()
    {
        if (obj==null)
            obj = new OrderMercedes();
        return obj;
    }
}