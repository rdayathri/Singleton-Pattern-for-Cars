
public class CarFactory {
    public OrderCar submitOrder(String car)
    {
        if (car == null || car.isEmpty())
            return null;
        if ("Mercedes".equals(car)) {
            return OrderMercedes.getInstance();
        }
        else if ("BMW".equals(car)) {
            return OrderBMW.getInstance();
        }
        else if ("Audi".equals(car)) {
            return OrderAudi.getInstance();
        }
        return null;
    }
    
    private static CarFactory obj;
    
    private CarFactory() {}
 
    public static synchronized CarFactory getInstance()
    {
        if (obj==null)
            obj = new CarFactory();
        return obj;
    }
}