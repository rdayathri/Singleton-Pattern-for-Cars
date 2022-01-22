public class OrderBMW implements OrderCar {
 
    @Override
    public void makeOrder()
    {
        System.out.println("Ordering a BMW Car. ");
    }
    
private static OrderBMW obj;
    
    private OrderBMW() {}
 
    public static synchronized OrderBMW getInstance()
    {
        if (obj==null)
            obj = new OrderBMW();
        return obj;
    }
}